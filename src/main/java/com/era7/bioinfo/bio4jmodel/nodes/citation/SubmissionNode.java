/*
 * Copyright (C) 2010-2011  "Bio4j"
 *
 * This file is part of Bio4j
 *
 * Bio4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.era7.bioinfo.bio4jmodel.nodes.citation;

import com.era7.bioinfo.bio4jmodel.nodes.ConsortiumNode;
import com.era7.bioinfo.bio4jmodel.nodes.PersonNode;
import com.era7.bioinfo.bio4jmodel.relationships.citation.submission.SubmissionAuthorConsortiumRel;
import com.era7.bioinfo.bio4jmodel.relationships.citation.submission.SubmissionAuthorPersonRel;
import com.era7.bioinfo.bio4jmodel.relationships.citation.submission.SubmissionDbRel;
import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.neo4j.graphdb.Direction;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;

/**
 * Submission protein citations
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class SubmissionNode extends BasicEntity{

    public static final String SUBMISSION_TITLE_INDEX = "submission_title_index";

    public static final String NODE_TYPE = SubmissionNode.class.getCanonicalName();

    public static final String TITLE_PROPERTY = "title";
    public static final String DATE_PROPERTY = "date";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "submission";


    public SubmissionNode(Node n){
        super(n);
    }


    public String getTitle(){    return String.valueOf(node.getProperty(TITLE_PROPERTY));}
    public String getDate(){    return String.valueOf(node.getProperty(DATE_PROPERTY));}


    public void setTitle(String value){  node.setProperty(TITLE_PROPERTY, value);}
    public void setDate(String value){  node.setProperty(DATE_PROPERTY, value);}
    
    
    /**
     * Gets the submission DB
     * @return 
     */
    public DBNode getDB(){
        Iterator<Relationship> iterator = this.node.getRelationships(new SubmissionDbRel(null), Direction.OUTGOING).iterator();
        if(iterator.hasNext()){
            return new DBNode(iterator.next().getEndNode());
        }else{
            return null;
        }
    }
    
    /**
     * gets consortium authors (if any) of the submission
     * @return 
     */
    public List<ConsortiumNode> getConsortiumAuthors(){
        List<ConsortiumNode> list = new ArrayList<ConsortiumNode>();
        Iterator<Relationship> iterator = this.node.getRelationships(new SubmissionAuthorConsortiumRel(null), Direction.OUTGOING).iterator();
        while(iterator.hasNext()){
            list.add(new ConsortiumNode(iterator.next().getEndNode()));
        }
        return list;
    }
    /**
     * gets person authors (if any) of the submission
     * @return 
     */
    public List<PersonNode> getPersonAuthors(){
        List<PersonNode> list = new ArrayList<PersonNode>();
        Iterator<Relationship> iterator = this.node.getRelationships(new SubmissionAuthorPersonRel(null), Direction.OUTGOING).iterator();
        while(iterator.hasNext()){
            list.add(new PersonNode(iterator.next().getEndNode()));
        }
        return list;
    }


    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof SubmissionNode){
            SubmissionNode other = (SubmissionNode) obj;
            return this.node.equals(other.node);
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "title = " + getTitle();
    }

}

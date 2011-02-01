/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.nodes.citation;

import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import org.neo4j.graphdb.Node;

/**
 *
 * @author ppareja
 */
public class SubmissionNode extends BasicEntity{

    public static final String SUBMISSION_TITLE_INDEX = "submission_title_index";

    public static final String TITLE_PROPERTY = "title";
    public static final String DATE_PROPERTY = "date";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "submission";


    public SubmissionNode(Node n){
        super(n);
        nodeType = SubmissionNode.class.getCanonicalName();
    }


    public String getTitle(){    return String.valueOf(node.getProperty(TITLE_PROPERTY));}
    public String getDate(){    return String.valueOf(node.getProperty(DATE_PROPERTY));}


    public void setTitle(String value){  node.setProperty(TITLE_PROPERTY, value);}
    public void setDate(String value){  node.setProperty(DATE_PROPERTY, value);}


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
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.comment;

import org.neo4j.graphdb.Relationship;

/**
 * Amino acid variation(s) due to RNA editing
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class RnaEditingCommentRel extends BasicCommentRel{

    public static final String RELATIONSHIP_NAME = "COMMENT_RNA_EDITING";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "RNA editing";

    public static final String POSITION_PROPERTY = "position";

    public RnaEditingCommentRel(Relationship rel){
        super(rel);
    }

    public String getPosition(){
        return String.valueOf(this.relationship.getProperty(POSITION_PROPERTY));
    }
    public void setPosition(String value){
        this.relationship.setProperty(POSITION_PROPERTY, value);
    }

    @Override
    public String name() {
        return RELATIONSHIP_NAME;
    }

    @Override
    public String toString(){
        return super.toString();
    }

}

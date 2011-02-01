/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era7.bioinfo.bio4jmodel.relationships.comment;

import org.neo4j.graphdb.Relationship;

/**
 *
 * @author ppareja
 */
public class ToxicDoseCommentRel extends BasicCommentRel{

    public static final String RELATIONSHIP_NAME = "COMMENT_TOXIC_DOSE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "toxic dose";

    public ToxicDoseCommentRel(Relationship rel){
        super(rel);
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

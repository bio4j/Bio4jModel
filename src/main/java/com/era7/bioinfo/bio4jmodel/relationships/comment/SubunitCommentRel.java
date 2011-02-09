/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.comment;

import org.neo4j.graphdb.Relationship;

/**
 * Interaction with other protein(s)
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class SubunitCommentRel extends BasicCommentRel{

    public static final String RELATIONSHIP_NAME = "COMMENT_SUBUNIT";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "subunit";

    public SubunitCommentRel(Relationship rel){
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



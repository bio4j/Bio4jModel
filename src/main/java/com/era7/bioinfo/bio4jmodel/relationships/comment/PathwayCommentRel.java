/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.comment;

import org.neo4j.graphdb.Relationship;

/**
 * Associated metabolic pathways
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class PathwayCommentRel extends BasicCommentRel{

    public static final String RELATIONSHIP_NAME = "COMMENT_PATHWAY";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "pathway";

    public PathwayCommentRel(Relationship rel){
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

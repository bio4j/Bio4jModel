/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.citation.onarticle;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 * Online article authors (people)
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class OnlineArticleAuthorPersonRel extends BasicRelationship{

    public static final String NAME = "ONLINE_ARTICLE_AUTHOR_PERSON";

    public OnlineArticleAuthorPersonRel(Relationship rel){
        super(rel);
    }

    @Override
    public String name() {
        return NAME;
    }

}

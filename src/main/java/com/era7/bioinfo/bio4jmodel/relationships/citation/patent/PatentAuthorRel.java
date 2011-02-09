/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.citation.patent;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 * Patent author
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class PatentAuthorRel extends BasicRelationship{

    public static final String NAME = "PATENT_AUTHOR";

    public PatentAuthorRel(Relationship rel){
        super(rel);
    }

    @Override
    public String name() {
        return NAME;
    }

}

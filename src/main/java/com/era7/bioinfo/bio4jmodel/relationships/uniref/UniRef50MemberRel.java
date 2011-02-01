/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.uniref;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class UniRef50MemberRel extends BasicRelationship{

    public static final String NAME = "UNIREF_50_MEMBER";

    public UniRef50MemberRel(Relationship rel){
        super(rel);
    }

    @Override
    public String name() {
        return NAME;
    }

}
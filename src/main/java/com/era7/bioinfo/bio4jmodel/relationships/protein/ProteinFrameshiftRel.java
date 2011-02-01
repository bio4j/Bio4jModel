/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.protein;

import org.neo4j.graphdb.Relationship;

/**
 *
 * @author ppareja
 */
public class ProteinFrameshiftRel extends BasicProteinSequenceCautionRel{

    public static final String RELATIONSHIP_NAME = "PROTEIN_FRAMESHIFT";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "frameshift";

    public ProteinFrameshiftRel(Relationship rel){
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
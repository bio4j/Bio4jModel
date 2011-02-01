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
public class ProteinErroneousGeneModelPredictionRel extends BasicProteinSequenceCautionRel{

    public static final String RELATIONSHIP_NAME = "PROTEIN_ERRONEOUS_GENE_MODEL_PREDICTION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "erroneous gene model prediction";

    public ProteinErroneousGeneModelPredictionRel(Relationship rel){
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
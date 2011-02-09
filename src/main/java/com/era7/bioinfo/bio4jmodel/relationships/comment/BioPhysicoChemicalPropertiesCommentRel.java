/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.comment;

import org.neo4j.graphdb.Relationship;

/**
 * Biophysical and physicochemical properties
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class BioPhysicoChemicalPropertiesCommentRel extends BasicCommentRel{

    public static final String RELATIONSHIP_NAME = "COMMENT_BIO_PHYSICO_CHEMICAL_PROPERTIES";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "biophysicochemical properties";

    public static final String PH_DEPENDENCE_PROPERTY = "ph_dependence";
    public static final String TEMPERATURE_DEPENDENCE_PROPERTY = "temperature_dependence";
    public static final String KINETICS_XML_PROPERTY = "kinetics_xml";
    public static final String ABSORPTION_MAX_PROPERTY = "absortption_max";
    public static final String ABSORPTION_TEXT_PROPERTY = "absorption_text";
    public static final String REDOX_POTENTIAL_PROPERTY = "redox_potential";
    public static final String REDOX_POTENTIAL_EVIDENCE_PROPERTY = "redox_potential_evidence";

    public BioPhysicoChemicalPropertiesCommentRel(Relationship rel){
        super(rel);
    }

    public String getPhDependence(){
        return String.valueOf(this.relationship.getProperty(PH_DEPENDENCE_PROPERTY));
    }
    public String getTemperatureDependence(){
        return String.valueOf(this.relationship.getProperty(TEMPERATURE_DEPENDENCE_PROPERTY));
    }
    public String getKineticsXmlProperty(){
        return String.valueOf(this.relationship.getProperty(KINETICS_XML_PROPERTY));
    }
    public String getAbsorptionMax(){
        return String.valueOf(this.relationship.getProperty(ABSORPTION_MAX_PROPERTY));
    }
    public String getAbsorptionText(){
        return String.valueOf(this.relationship.getProperty(ABSORPTION_TEXT_PROPERTY));
    }
    public String getRedoxPotential(){
        return String.valueOf(this.relationship.getProperty(REDOX_POTENTIAL_PROPERTY));
    }
    public String getRedoxPotentialEvidence(){
        return String.valueOf(this.relationship.getProperty(REDOX_POTENTIAL_EVIDENCE_PROPERTY));
    }

    public void setPhDependence(String value){
        this.relationship.setProperty(PH_DEPENDENCE_PROPERTY, value);
    }
    public void setTemperatureDependence(String value){
        this.relationship.setProperty(TEMPERATURE_DEPENDENCE_PROPERTY, value);
    }
    public void setKineticsXml(String value){
        this.relationship.setProperty(KINETICS_XML_PROPERTY, value);
    }
    public void setAbsorptionMax(String value){
        this.relationship.setProperty(ABSORPTION_MAX_PROPERTY, value);
    }
    public void setAbsorptionText(String value){
        this.relationship.setProperty(ABSORPTION_TEXT_PROPERTY, value);
    }
    public void setRedoxPotential(String value){
        this.relationship.setProperty(REDOX_POTENTIAL_PROPERTY, value);
    }
    public void setRedoxPotentialEvidence(String value){
        this.relationship.setProperty(REDOX_POTENTIAL_EVIDENCE_PROPERTY, value);
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


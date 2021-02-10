package com.example.reportcard;

public class ReportCard {
    String Name;
    String EnglishGrade;
    String MathsGrade;
    String ScienceGrade;
    String SocialScienceGrade;
    String HindiGrade;
    String PunjabiGrade;
    int EnglishMarks;
    int MathsMarks;
    int ScienceMarks;
    int SocialScienceMarks;
    int HindiMarks;
    int PunjabiMarks;

    /**
     * constructor for creating an object student having a report card
     * @param name takes the name of the student
     */
    public ReportCard(String name)
    {
        Name=name;
    }

    /**
     * setting english grade
     * @param englishGrade takes the grade of the student in english subject
     */

    public void setEnglishGrade(String englishGrade) {
        EnglishGrade = englishGrade;
    }

    /**
     * setting hindi grade
     * @param hindiGrade takes the grade of student in hindi subject
     */
    public void setHindiGrade(String hindiGrade) {
        HindiGrade = hindiGrade;
    }

    /**
     * setting maths grade
     * @param mathsGrade takes the grade of student in maths subject
     */
    public void setMathsGrade(String mathsGrade)
    {
        MathsGrade=mathsGrade;
    }

    /**
     * setting science grade
     * @param scienceGrade takes the grade of student in science subject
     */
    public void setScienceGrade(String scienceGrade)
    {
        ScienceGrade=scienceGrade;
    }

    /**
     * setting social science grade
     * @param socialScienceGrade takes the grade of student in social science subject
     */
    public void setSocialScienceGrade(String socialScienceGrade) {
        SocialScienceGrade = socialScienceGrade;
    }

    /**
     * setting punjabi grade
     * @param punjabiGrade takes the grade of student in punjabi subject
     */

    public void setPunjabiGrade(String punjabiGrade) {
        PunjabiGrade = punjabiGrade;
    }

    /**
     * set english marks
     * @param englishMarks takes marks obtained by student in english subject
     */
    public void setEnglishMarks(int englishMarks) {
        EnglishMarks = englishMarks;
    }

    /**
     * set maths marks
     * @param mathsMarks takes marks obtained by student in maths subject
     */
    public void setMathsMarks(int mathsMarks) {
        MathsMarks = mathsMarks;
    }

    public void setPunjabiMarks(int punjabiMarks) {
        PunjabiMarks = punjabiMarks;
    }

    public void setHindiMarks(int hindiMarks) {
        HindiMarks = hindiMarks;
    }

    public void setScienceMarks(int scienceMarks) {
        ScienceMarks = scienceMarks;
    }

    public void setSocialScienceMarks(int socialScienceMarks) {
        SocialScienceMarks = socialScienceMarks;
    }

    public int getEnglishMarks() {
        return EnglishMarks;
    }

    public int getHindiMarks() {
        return HindiMarks;
    }

    public int getMathsMarks() {
        return MathsMarks;
    }

    public int getPunjabiMarks() {
        return PunjabiMarks;
    }

    public int getScienceMarks() {
        return ScienceMarks;
    }

    public int getSocialScienceMarks() {
        return SocialScienceMarks;
    }

    public String getEnglishGrade() {
        return EnglishGrade;
    }

    public String getHindiGrade() {
        return HindiGrade;
    }

    public String getMathsGrade() {
        return MathsGrade;
    }

    public String getPunjabiGrade() {
        return PunjabiGrade;
    }

    public String getScienceGrade() {
        return ScienceGrade;
    }

    public String getSocialScienceGrade() {
        return SocialScienceGrade;
    }
    public String getName()
    {
        return Name;
    }
}

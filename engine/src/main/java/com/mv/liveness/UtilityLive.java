package com.mv.liveness;


public class UtilityLive {
    private static final UtilityLive ourInstance = new UtilityLive();
    public String documentKey = "log";
    public String filePath = "/PassportReadNFC_";
    private String passportNumber;
    private String dateOfBirth;
    private String expiryDate;
    //    private String logoUrl="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRbk0YDyfWSiZJNMehf3KvJrbLPvVyUTyM2nt0TGwCGjJB06-WDNg";
//    private String logoUrl = "";
//    private int backgroundColorCode = 0;
//    private int buttonColorCode = 0;
//    private int textColorCode = 0;
    //    private int textColorCode=0xffffffff;
    private String fullName;
    private String gender;
    private String nationality;
    private String agencyCode = "Demo101";

    public int getThemeId() {
        return themeId;
    }

    public void setThemeId(int themeId) {
        this.themeId = themeId;
    }

    private int themeId  = 1;

    public byte[] scannedImage;
    public byte[] liveImage;

    private UtilityLive() {
    }

    public static UtilityLive getInstance() {
        return ourInstance;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

}

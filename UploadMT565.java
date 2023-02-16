import java.time.LocalDate;

public class UploadMT565 {
    private Long id;
    private String accountNumber;
    private String holderName;
    private String investorId;
    private String country;
    private String investorType;
    private String isin;
    private Integer quantity;
    private LocalDate uploadDate;
    private String uploadStatus;
    private String uploadInstance;

    public UploadMT565() {
    }

    public UploadMT565(Long id, String accountNumber, String holderName, String investorId, String country, String investorType, String isin, Integer quantity, LocalDate uploadDate, String uploadStatus, String uploadInstance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.investorId = investorId;
        this.country = country;
        this.investorType = investorType;
        this.isin = isin;
        this.quantity = quantity;
        this.uploadDate = uploadDate;
        this.uploadStatus = uploadStatus;
        this.uploadInstance = uploadInstance;
    }

    public UploadMT565(String accountNumber, String holderName, String investorId, String country, String investorType, String isin, Integer quantity, LocalDate uploadDate, String uploadStatus, String uploadInstance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.investorId = investorId;
        this.country = country;
        this.investorType = investorType;
        this.isin = isin;
        this.quantity = quantity;
        this.uploadDate = uploadDate;
        this.uploadStatus = uploadStatus;
        this.uploadInstance = uploadInstance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getInvestorId() {
        return investorId;
    }

    public void setInvestorId(String investorId) {
        this.investorId = investorId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getInvestorType() {
        return investorType;
    }

    public void setInvestorType(String investorType) {
        this.investorType = investorType;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDate getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDate uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getUploadStatus() {
        return uploadStatus;
    }

    public void setUploadStatus(String uploadStatus) {
        this.uploadStatus = uploadStatus;
    }

    public String getUploadInstance() {
        return uploadInstance;
    }

    public void setUploadInstance(String uploadInstance) {
        this.uploadInstance = uploadInstance;
    }
}

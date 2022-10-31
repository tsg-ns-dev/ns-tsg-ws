
package com.tsg.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Record complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Record"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nullFieldList" type="{urn:core_2022_1.platform.webservices.netsuite.com}NullField" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Record", namespace = "urn:core_2022_1.platform.webservices.netsuite.com", propOrder = {
    "nullFieldList"
})
@XmlSeeAlso({
    Employee.class,
    PayrollItem.class,
    JournalEntry.class,
    InterCompanyJournalEntry.class,
    StatisticalJournalEntry.class,
    SiteCategory.class,
    VendorBill.class,
    PurchaseOrder.class,
    ItemReceipt.class,
    VendorPayment.class,
    VendorCredit.class,
    VendorReturnAuthorization.class,
    PurchaseRequisition.class,
    Check.class,
    Deposit.class,
    ManufacturingCostTemplate.class,
    ManufacturingRouting.class,
    ManufacturingOperationTask.class,
    Campaign.class,
    CampaignCategory.class,
    CampaignAudience.class,
    CampaignFamily.class,
    CampaignSearchEngine.class,
    CampaignChannel.class,
    CampaignOffer.class,
    CampaignResponse2 .class,
    CampaignVertical.class,
    CampaignSubscription.class,
    PromotionCode.class,
    CouponCode.class,
    File.class,
    Folder.class,
    Address.class,
    LandedCost.class,
    InventoryDetail.class,
    ContactCategory.class,
    CustomerCategory.class,
    SalesRole.class,
    PriceLevel.class,
    WinLossReason.class,
    Term.class,
    NoteType.class,
    PaymentMethod.class,
    LeadSource.class,
    InventoryItem.class,
    DescriptionItem.class,
    DiscountItem.class,
    DownloadItem.class,
    MarkupItem.class,
    PaymentItem.class,
    SubtotalItem.class,
    NonInventoryPurchaseItem.class,
    NonInventorySaleItem.class,
    NonInventoryResaleItem.class,
    OtherChargeResaleItem.class,
    OtherChargePurchaseItem.class,
    ServiceResaleItem.class,
    ServicePurchaseItem.class,
    ServiceSaleItem.class,
    OtherChargeSaleItem.class,
    Currency.class,
    ExpenseCategory.class,
    Account.class,
    Department.class,
    Classification.class,
    Location.class,
    UnitsType.class,
    ContactRole.class,
    Bin.class,
    SalesTaxItem.class,
    TaxGroup.class,
    TaxType.class,
    SerializedInventoryItem.class,
    LotNumberedInventoryItem.class,
    GiftCertificateItem.class,
    Subsidiary.class,
    GiftCertificate.class,
    PartnerCategory.class,
    VendorCategory.class,
    KitItem.class,
    AssemblyItem.class,
    SerializedAssemblyItem.class,
    LotNumberedAssemblyItem.class,
    State.class,
    AccountingPeriod.class,
    BudgetCategory.class,
    PricingGroup.class,
    InventoryNumber.class,
    RevRecSchedule.class,
    RevRecTemplate.class,
    CostCategory.class,
    Nexus.class,
    CustomerMessage.class,
    OtherNameCategory.class,
    ItemGroup.class,
    CurrencyRate.class,
    ItemRevision.class,
    TaxAcct.class,
    BillingSchedule.class,
    GlobalAccountMapping.class,
    ItemAccountMapping.class,
    FairValuePrice.class,
    ConsolidatedExchangeRate.class,
    InventoryAdjustment.class,
    AssemblyBuild.class,
    AssemblyUnbuild.class,
    TransferOrder.class,
    InterCompanyTransferOrder.class,
    WorkOrder.class,
    InventoryTransfer.class,
    BinTransfer.class,
    BinWorksheet.class,
    WorkOrderIssue.class,
    WorkOrderCompletion.class,
    WorkOrderClose.class,
    InventoryCostRevaluation.class,
    CustomRecord.class,
    CustomList.class,
    CustomRecordType.class,
    CustomTransaction.class,
    CustomFieldType.class,
    CalendarEvent.class,
    Task.class,
    PhoneCall.class,
    ProjectTask.class,
    ResourceAllocation.class,
    Note.class,
    Message.class,
    SupportCase.class,
    SupportCaseStatus.class,
    SupportCaseType.class,
    SupportCaseOrigin.class,
    SupportCaseIssue.class,
    SupportCasePriority.class,
    Solution.class,
    Topic.class,
    Issue.class,
    Budget.class,
    ItemDemandPlan.class,
    ItemSupplyPlan.class,
    CashRefund.class,
    CustomerPayment.class,
    ReturnAuthorization.class,
    CreditMemo.class,
    CustomerRefund.class,
    CustomerDeposit.class,
    DepositApplication.class,
    Charge.class,
    TimeBill.class,
    ExpenseReport.class,
    PaycheckJournal.class,
    TimeEntry.class,
    TimeSheet.class,
    Contact.class,
    Customer.class,
    CustomerStatus.class,
    Partner.class,
    Vendor.class,
    EntityGroup.class,
    Job.class,
    JobType.class,
    JobStatus.class,
    BillingAccount.class,
    Opportunity.class,
    SalesOrder.class,
    ItemFulfillment.class,
    Invoice.class,
    CashSale.class,
    Estimate.class,
    Usage.class
})
public abstract class Record
    implements Serializable
{

    protected NullField nullFieldList;

    /**
     * Gets the value of the nullFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link NullField }
     *     
     */
    public NullField getNullFieldList() {
        return nullFieldList;
    }

    /**
     * Sets the value of the nullFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullField }
     *     
     */
    public void setNullFieldList(NullField value) {
        this.nullFieldList = value;
    }

}

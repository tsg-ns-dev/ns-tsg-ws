package com.tsg.netsuite.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2017-12-18T14:58:00.508-07:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "urn:platform_2022_1.webservices.netsuite.com", name = "NetSuitePortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface NetSuitePortType {

    @WebMethod(action = "asyncDeleteList")
    @WebResult(name = "asyncDeleteListResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public AsyncStatusResponse asyncDeleteList(
        @WebParam(partName = "parameters", name = "asyncDeleteList", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        AsyncDeleteListRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "getCustomizationId")
    @WebResult(name = "getCustomizationIdResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public GetCustomizationIdResponse getCustomizationId(
        @WebParam(partName = "parameters", name = "getCustomizationId", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        GetCustomizationIdRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "initialize")
    @WebResult(name = "initializeResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public InitializeResponse initialize(
        @WebParam(partName = "parameters", name = "initialize", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        InitializeRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "ssoLogin")
    @WebResult(name = "ssoLoginResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public SsoLoginResponse ssoLogin(
        @WebParam(partName = "parameters", name = "ssoLogin", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        SsoLoginRequest parameters
    ) throws InvalidAccountFault_Exception, InsufficientPermissionFault_Exception, InvalidCredentialsFault_Exception, InvalidVersionFault_Exception, InvalidSessionFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception;

    @WebMethod(action = "getItemAvailability")
    @WebResult(name = "getItemAvailabilityResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public GetItemAvailabilityResponse getItemAvailability(
        @WebParam(partName = "parameters", name = "getItemAvailability", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        GetItemAvailabilityRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "checkAsyncStatus")
    @WebResult(name = "checkAsyncStatusResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public AsyncStatusResponse checkAsyncStatus(
        @WebParam(partName = "parameters", name = "checkAsyncStatus", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        CheckAsyncStatusRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, AsyncFault_Exception, InsufficientPermissionFault_Exception, InvalidCredentialsFault_Exception, InvalidSessionFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception;

    @WebMethod(action = "searchMore")
    @WebResult(name = "searchMoreResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public SearchMoreResponse searchMore(
        @WebParam(partName = "parameters", name = "searchMore", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        SearchMoreRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "getSelectValue")
    @WebResult(name = "getSelectValueResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public GetSelectValueResponse getSelectValue(
        @WebParam(partName = "parameters", name = "getSelectValue", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        GetSelectValueRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "detach")
    @WebResult(name = "detachResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public DetachResponse detach(
        @WebParam(partName = "parameters", name = "detach", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        DetachRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "asyncAddList")
    @WebResult(name = "asyncAddListResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public AsyncStatusResponse asyncAddList(
        @WebParam(partName = "parameters", name = "asyncAddList", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        AsyncAddListRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "changeEmail")
    @WebResult(name = "changeEmailResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public ChangeEmailResponse changeEmail(
        @WebParam(partName = "parameters", name = "changeEmail", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        ChangeEmailRequest parameters
    ) throws InvalidAccountFault_Exception, InsufficientPermissionFault_Exception, InvalidCredentialsFault_Exception, InvalidVersionFault_Exception, InvalidSessionFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception;

    @WebMethod(action = "updateInviteeStatusList")
    @WebResult(name = "updateInviteeStatusListResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public UpdateInviteeStatusListResponse updateInviteeStatusList(
        @WebParam(partName = "parameters", name = "updateInviteeStatusList", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        UpdateInviteeStatusListRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "getAll")
    @WebResult(name = "getAllResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public GetAllResponse getAll(
        @WebParam(partName = "parameters", name = "getAll", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        GetAllRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "asyncSearch")
    @WebResult(name = "asyncSearchResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public AsyncStatusResponse asyncSearch(
        @WebParam(partName = "parameters", name = "asyncSearch", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        AsyncSearchRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "add")
    @WebResult(name = "addResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public AddResponse add(
        @WebParam(partName = "parameters", name = "add", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        AddRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "upsertList")
    @WebResult(name = "upsertListResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public UpsertListResponse upsertList(
        @WebParam(partName = "parameters", name = "upsertList", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        UpsertListRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "asyncInitializeList")
    @WebResult(name = "asyncInitializeListResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public AsyncStatusResponse asyncInitializeList(
        @WebParam(partName = "parameters", name = "asyncInitializeList", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        AsyncInitializeListRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "getPostingTransactionSummary")
    @WebResult(name = "getPostingTransactionSummaryResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public GetPostingTransactionSummaryResponse getPostingTransactionSummary(
        @WebParam(partName = "parameters", name = "getPostingTransactionSummary", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        GetPostingTransactionSummaryRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "upsert")
    @WebResult(name = "upsertResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public UpsertResponse upsert(
        @WebParam(partName = "parameters", name = "upsert", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        UpsertRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "changePassword")
    @WebResult(name = "changePasswordResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public ChangePasswordResponse changePassword(
        @WebParam(partName = "parameters", name = "changePassword", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        ChangePasswordRequest parameters
    ) throws InvalidAccountFault_Exception, InsufficientPermissionFault_Exception, InvalidCredentialsFault_Exception, InvalidVersionFault_Exception, InvalidSessionFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception;

    @WebMethod(action = "logout")
    @WebResult(name = "logoutResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public LogoutResponse logout(
        @WebParam(partName = "parameters", name = "logout", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        LogoutRequest parameters
    ) throws InvalidSessionFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, InsufficientPermissionFault_Exception, InvalidCredentialsFault_Exception;

    @WebMethod(action = "search")
    @WebResult(name = "searchResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public SearchResponse search(
        @WebParam(partName = "parameters", name = "search", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        SearchRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "getAsyncResult")
    @WebResult(name = "getAsyncResultResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public GetAsyncResultResponse getAsyncResult(
        @WebParam(partName = "parameters", name = "getAsyncResult", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        GetAsyncResultRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, AsyncFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "initializeList")
    @WebResult(name = "initializeListResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public InitializeListResponse initializeList(
        @WebParam(partName = "parameters", name = "initializeList", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        InitializeListRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "asyncUpsertList")
    @WebResult(name = "asyncUpsertListResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public AsyncStatusResponse asyncUpsertList(
        @WebParam(partName = "parameters", name = "asyncUpsertList", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        AsyncUpsertListRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "get")
    @WebResult(name = "getResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public GetResponse get(
        @WebParam(partName = "parameters", name = "get", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        GetRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "getList")
    @WebResult(name = "getListResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public GetListResponse getList(
        @WebParam(partName = "parameters", name = "getList", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        GetListRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "getDeleted")
    @WebResult(name = "getDeletedResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public GetDeletedResponse getDeleted(
        @WebParam(partName = "parameters", name = "getDeleted", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        GetDeletedRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "getCurrencyRate")
    @WebResult(name = "getCurrencyRateResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public GetCurrencyRateResponse getCurrencyRate(
        @WebParam(partName = "parameters", name = "getCurrencyRate", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        GetCurrencyRateRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "attach")
    @WebResult(name = "attachResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public AttachResponse attach(
        @WebParam(partName = "parameters", name = "attach", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        AttachRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "searchMoreWithId")
    @WebResult(name = "searchMoreWithIdResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public SearchMoreWithIdResponse searchMoreWithId(
        @WebParam(partName = "parameters", name = "searchMoreWithId", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        SearchMoreWithIdRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "addList")
    @WebResult(name = "addListResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public AddListResponse addList(
        @WebParam(partName = "parameters", name = "addList", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        AddListRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "mapSso")
    @WebResult(name = "mapSsoResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public MapSsoResponse mapSso(
        @WebParam(partName = "parameters", name = "mapSso", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        MapSsoRequest parameters
    ) throws InvalidAccountFault_Exception, InsufficientPermissionFault_Exception, InvalidCredentialsFault_Exception, InvalidVersionFault_Exception, InvalidSessionFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception;

    @WebMethod(action = "searchNext")
    @WebResult(name = "searchNextResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public SearchNextResponse searchNext(
        @WebParam(partName = "parameters", name = "searchNext", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        SearchNextRequest parameters
    ) throws InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "updateList")
    @WebResult(name = "updateListResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public UpdateListResponse updateList(
        @WebParam(partName = "parameters", name = "updateList", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        UpdateListRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "updateInviteeStatus")
    @WebResult(name = "updateInviteeStatusResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public UpdateInviteeStatusResponse updateInviteeStatus(
        @WebParam(partName = "parameters", name = "updateInviteeStatus", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        UpdateInviteeStatusRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "getDataCenterUrls")
    @WebResult(name = "getDataCenterUrlsResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public GetDataCenterUrlsResponse getDataCenterUrls(
        @WebParam(partName = "parameters", name = "getDataCenterUrls", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        GetDataCenterUrlsRequest parameters
    ) throws InvalidSessionFault_Exception, UnexpectedErrorFault_Exception, InsufficientPermissionFault_Exception, InvalidCredentialsFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "asyncGetList")
    @WebResult(name = "asyncGetListResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public AsyncStatusResponse asyncGetList(
        @WebParam(partName = "parameters", name = "asyncGetList", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        AsyncGetListRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "deleteList")
    @WebResult(name = "deleteListResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public DeleteListResponse deleteList(
        @WebParam(partName = "parameters", name = "deleteList", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        DeleteListRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "asyncUpdateList")
    @WebResult(name = "asyncUpdateListResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public AsyncStatusResponse asyncUpdateList(
        @WebParam(partName = "parameters", name = "asyncUpdateList", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        AsyncUpdateListRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "getBudgetExchangeRate")
    @WebResult(name = "getBudgetExchangeRateResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public GetBudgetExchangeRateResponse getBudgetExchangeRate(
        @WebParam(partName = "parameters", name = "getBudgetExchangeRate", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        GetBudgetExchangeRateRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "update")
    @WebResult(name = "updateResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public UpdateResponse update(
        @WebParam(partName = "parameters", name = "update", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        UpdateRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "getSavedSearch")
    @WebResult(name = "getSavedSearchResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public GetSavedSearchResponse getSavedSearch(
        @WebParam(partName = "parameters", name = "getSavedSearch", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        GetSavedSearchRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "delete")
    @WebResult(name = "deleteResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public DeleteResponse delete(
        @WebParam(partName = "parameters", name = "delete", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        DeleteRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InvalidCredentialsFault_Exception, InsufficientPermissionFault_Exception, ExceededRecordCountFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception, ExceededRequestSizeFault_Exception;

    @WebMethod(action = "getServerTime")
    @WebResult(name = "getServerTimeResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public GetServerTimeResponse getServerTime(
        @WebParam(partName = "parameters", name = "getServerTime", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        GetServerTimeRequest parameters
    ) throws ExceededConcurrentRequestLimitFault_Exception, InsufficientPermissionFault_Exception, InvalidCredentialsFault_Exception, InvalidSessionFault_Exception, ExceededUsageLimitFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception;

    @WebMethod(action = "login")
    @WebResult(name = "loginResponse", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com", partName = "parameters")
    public LoginResponse login(
        @WebParam(partName = "parameters", name = "login", targetNamespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
        LoginRequest parameters
    ) throws InvalidAccountFault_Exception, InsufficientPermissionFault_Exception, InvalidCredentialsFault_Exception, InvalidVersionFault_Exception, InvalidSessionFault_Exception, UnexpectedErrorFault_Exception, ExceededRequestLimitFault_Exception;
}

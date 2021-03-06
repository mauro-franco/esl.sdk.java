package com.silanis.esl.api.model;
//
import java.util.List;
import java.util.Map;

public interface IPackage extends IBasePackage{
    public IPackage setAutocomplete( Boolean value);
    public Boolean getAutocomplete();
    public IPackage setCompleted( java.util.Date value);
    public java.util.Date getCompleted();
    public IPackage setConsent( String value);
    public String getConsent();
    public IPackage setData( Map<String, Object> value);
    public Map<String, Object> getData();
    public IPackage setDescription( String value);
    public String getDescription();
    public IPackage setDocuments( List<Document> value);
    public List<Document> getDocuments();
    public IPackage setDue( java.util.Date value);
    public java.util.Date getDue();
    public IPackage setEmailMessage( String value);
    public String getEmailMessage();
    public IPackage setId( String value);
    public String getId();
    public IPackage setLanguage( String value);
    public String getLanguage();
    public IPackage setLimits( PackageArtifactsLimits value);
    public PackageArtifactsLimits getLimits();
    public IPackage setMessages( List<Message> value);
    public List<Message> getMessages();
    public IPackage setName( String value);
    public String getName();
    public IPackage setRoles( List<Role> value);
    public List<Role> getRoles();
    public IPackage setSender( Sender value);
    public Sender getSender();
    public IPackage setSettings( PackageSettings value);
    public PackageSettings getSettings();
    public IPackage setSignedDocumentDelivery( SignedDocumentDelivery value);
    public SignedDocumentDelivery getSignedDocumentDelivery();
    public IPackage setStatus( PackageStatus value);
    public PackageStatus getStatus();
    public IPackage setTrashed( Boolean value);
    public Boolean getTrashed();
    public IPackage setType( BasePackageType value);
    public BasePackageType getType();
    public IPackage setUpdated( java.util.Date value);
    public java.util.Date getUpdated();
    }
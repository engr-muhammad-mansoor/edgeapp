package com.edge.app.saas.edgeapp.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int idAccount;
    @Column(nullable = false)
	private String name;
	@Column(nullable = false, length = 9)
	private String siren;
	@Column(nullable = true, length = 14)
	private String siret;
	@Column(nullable = false)
	private Date dt_creation;
	private Date dt_subscription;
	@Column(nullable = true, length = 50)
	private String contact_name;
	@Column(nullable = true, length = 50)
	private String contact_mail;
	@Column(nullable = true, length = 50)
	private String contact_phone;
	@Column(nullable = true, length = 50)
	private String contact_mobile_phone;
	private String contact_address_1;
	private String contact_address_2;
	@Column(nullable = true, length = 5)
	private String contact_postal_code;
	@Column(nullable = true, length = 50)
	private String contact_city;
	@Column(nullable = true, length = 50)
	private String contact_country;
	@Column(nullable = true, length = 50)
	private String adv_name;
	@Column(nullable = true, length = 50)
	private String adv_mail;
	@Column(nullable = true, length = 50)
	private String adv_phone;
	@Column(nullable = true, length = 50)
	private String adv_mobile_phone;
	private String adv_address_1;
	private String adv_address_2;
	@Column(nullable = true, length = 5)
	private String adv_postal_code;
	@Column(nullable = true, length = 50)
	private String adv_city;
	@Column(nullable = true, length = 50)
	private String adv_country;
	@Column(nullable = true, length = 50)
	private String ba_name;
	@Column(nullable = true, length = 50)
	private String ba_mail;
	@Column(nullable = true, length = 50)
	private String ba_phone;
	@Column(nullable = true, length = 50)
	private String ba_mobile_phone;
	private String ba_address_1;
	private String ba_address_2;
	@Column(nullable = true, length = 5)
	private String ba_postal_code;
	@Column(nullable = true, length = 50)
	private String ba_city;
	@Column(nullable = true, length = 50)
	private String ba_country;
	@Column(nullable = true, length = 50)
	private String ba_tva;
	@Column(nullable = true, length = 50)
	private String ba_banque_name;
	@Column(nullable = true, length = 50)
	private String ba_code_banque;
	@Column(nullable = true, length = 50)
	private String ba_number_banque;
	@Column(nullable = true, length = 50)
	private String ba_number_account_banque;
	@Column(nullable = true, length = 50)
	private String ba_iban;
	@Column(nullable = true, length = 50)
	private String ba_swift_bic;

    public Account(int idAccount, String name, String siren, String siret, Date dt_creation, Date dt_subscription,
			String contact_name, String contact_mail, String contact_phone, String contact_mobile_phone,
			String contact_address_1, String contact_address_2, String contact_postal_code, String contact_city,
			String contact_country, String adv_name, String adv_mail, String adv_phone, String adv_mobile_phone,
			String adv_address_1, String adv_address_2, String adv_postal_code, String adv_city, String adv_country,
			String ba_name, String ba_mail, String ba_phone, String ba_mobile_phone, String ba_address_1,
			String ba_address_2, String ba_postal_code, String ba_city, String ba_country, String ba_tva,
			String ba_banque_name, String ba_code_banque, String ba_number_banque, String ba_number_account_banque,
			String ba_iban, String ba_swift_bic) {
		super();
		this.idAccount = idAccount;
		this.name = name;
		this.siren = siren;
		this.siret = siret;
		this.dt_creation = dt_creation;
		this.dt_subscription = dt_subscription;
		this.contact_name = contact_name;
		this.contact_mail = contact_mail;
		this.contact_phone = contact_phone;
		this.contact_mobile_phone = contact_mobile_phone;
		this.contact_address_1 = contact_address_1;
		this.contact_address_2 = contact_address_2;
		this.contact_postal_code = contact_postal_code;
		this.contact_city = contact_city;
		this.contact_country = contact_country;
		this.adv_name = adv_name;
		this.adv_mail = adv_mail;
		this.adv_phone = adv_phone;
		this.adv_mobile_phone = adv_mobile_phone;
		this.adv_address_1 = adv_address_1;
		this.adv_address_2 = adv_address_2;
		this.adv_postal_code = adv_postal_code;
		this.adv_city = adv_city;
		this.adv_country = adv_country;
		this.ba_name = ba_name;
		this.ba_mail = ba_mail;
		this.ba_phone = ba_phone;
		this.ba_mobile_phone = ba_mobile_phone;
		this.ba_address_1 = ba_address_1;
		this.ba_address_2 = ba_address_2;
		this.ba_postal_code = ba_postal_code;
		this.ba_city = ba_city;
		this.ba_country = ba_country;
		this.ba_tva = ba_tva;
		this.ba_banque_name = ba_banque_name;
		this.ba_code_banque = ba_code_banque;
		this.ba_number_banque = ba_number_banque;
		this.ba_number_account_banque = ba_number_account_banque;
		this.ba_iban = ba_iban;
		this.ba_swift_bic = ba_swift_bic;
	}
	public int getIdAccount() {
        return idAccount;
    }
    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSiren() {
		return siren;
	}
	public void setSiren(String siren) {
		this.siren = siren;
	}
	public String getSiret() {
		return siret;
	}
	public void setSiret(String siret) {
		this.siret = siret;
	}
	public Date getDt_creation() {
		return dt_creation;
	}
	public void setDt_creation(Date dt_creation) {
		this.dt_creation = dt_creation;
	}
	public Date getDt_subscription() {
		return dt_subscription;
	}
	public void setDt_subscription(Date dt_subscription) {
		this.dt_subscription = dt_subscription;
	}
	public String getContact_name() {
		return contact_name;
	}
	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}
	public String getContact_mail() {
		return contact_mail;
	}
	public void setContact_mail(String contact_mail) {
		this.contact_mail = contact_mail;
	}
	public String getContact_phone() {
		return contact_phone;
	}
	public void setContact_phone(String contact_phone) {
		this.contact_phone = contact_phone;
	}
	public String getContact_mobile_phone() {
		return contact_mobile_phone;
	}
	public void setContact_mobile_phone(String contact_mobile_phone) {
		this.contact_mobile_phone = contact_mobile_phone;
	}
	public String getContact_address_1() {
		return contact_address_1;
	}
	public void setContact_address_1(String contact_address_1) {
		this.contact_address_1 = contact_address_1;
	}
	public String getContact_address_2() {
		return contact_address_2;
	}
	public void setContact_address_2(String contact_address_2) {
		this.contact_address_2 = contact_address_2;
	}
	public String getContact_postal_code() {
		return contact_postal_code;
	}
	public void setContact_postal_code(String contact_postal_code) {
		this.contact_postal_code = contact_postal_code;
	}
	public String getContact_city() {
		return contact_city;
	}
	public void setContact_city(String contact_city) {
		this.contact_city = contact_city;
	}
	public String getContact_country() {
		return contact_country;
	}
	public void setContact_country(String contact_country) {
		this.contact_country = contact_country;
	}
	public String getAdv_name() {
		return adv_name;
	}
	public void setAdv_name(String adv_name) {
		this.adv_name = adv_name;
	}
	public String getAdv_mail() {
		return adv_mail;
	}
	public void setAdv_mail(String adv_mail) {
		this.adv_mail = adv_mail;
	}
	public String getAdv_phone() {
		return adv_phone;
	}
	public void setAdv_phone(String adv_phone) {
		this.adv_phone = adv_phone;
	}
	public String getAdv_mobile_phone() {
		return adv_mobile_phone;
	}
	public void setAdv_mobile_phone(String adv_mobile_phone) {
		this.adv_mobile_phone = adv_mobile_phone;
	}
	public String getAdv_address_1() {
		return adv_address_1;
	}
	public void setAdv_address_1(String adv_address_1) {
		this.adv_address_1 = adv_address_1;
	}
	public String getAdv_address_2() {
		return adv_address_2;
	}
	public void setAdv_address_2(String adv_address_2) {
		this.adv_address_2 = adv_address_2;
	}
	public String getAdv_postal_code() {
		return adv_postal_code;
	}
	public void setAdv_postal_code(String adv_postal_code) {
		this.adv_postal_code = adv_postal_code;
	}
	public String getAdv_city() {
		return adv_city;
	}
	public void setAdv_city(String adv_city) {
		this.adv_city = adv_city;
	}
	public String getAdv_country() {
		return adv_country;
	}
	public void setAdv_country(String adv_country) {
		this.adv_country = adv_country;
	}
	public String getBa_name() {
		return ba_name;
	}
	public void setBa_name(String ba_name) {
		this.ba_name = ba_name;
	}
	public String getBa_mail() {
		return ba_mail;
	}
	public void setBa_mail(String ba_mail) {
		this.ba_mail = ba_mail;
	}
	public String getBa_phone() {
		return ba_phone;
	}
	public void setBa_phone(String ba_phone) {
		this.ba_phone = ba_phone;
	}
	public String getBa_mobile_phone() {
		return ba_mobile_phone;
	}
	public void setBa_mobile_phone(String ba_mobile_phone) {
		this.ba_mobile_phone = ba_mobile_phone;
	}
	public String getBa_address_1() {
		return ba_address_1;
	}
	public void setBa_address_1(String ba_address_1) {
		this.ba_address_1 = ba_address_1;
	}
	public String getBa_address_2() {
		return ba_address_2;
	}
	public void setBa_address_2(String ba_address_2) {
		this.ba_address_2 = ba_address_2;
	}
	public String getBa_postal_code() {
		return ba_postal_code;
	}
	public void setBa_postal_code(String ba_postal_code) {
		this.ba_postal_code = ba_postal_code;
	}
	public String getBa_city() {
		return ba_city;
	}
	public void setBa_city(String ba_city) {
		this.ba_city = ba_city;
	}
	public String getBa_country() {
		return ba_country;
	}
	public void setBa_country(String ba_country) {
		this.ba_country = ba_country;
	}
	public String getBa_tva() {
		return ba_tva;
	}
	public void setBa_tva(String ba_tva) {
		this.ba_tva = ba_tva;
	}
	public String getBa_banque_name() {
		return ba_banque_name;
	}
	public void setBa_banque_name(String ba_banque_name) {
		this.ba_banque_name = ba_banque_name;
	}
	public String getBa_code_banque() {
		return ba_code_banque;
	}
	public void setBa_code_banque(String ba_code_banque) {
		this.ba_code_banque = ba_code_banque;
	}
	public String getBa_number_banque() {
		return ba_number_banque;
	}
	public void setBa_number_banque(String ba_number_banque) {
		this.ba_number_banque = ba_number_banque;
	}
	public String getBa_number_account_banque() {
		return ba_number_account_banque;
	}
	public void setBa_number_account_banque(String ba_number_account_banque) {
		this.ba_number_account_banque = ba_number_account_banque;
	}
	public String getBa_iban() {
		return ba_iban;
	}
	public void setBa_iban(String ba_iban) {
		this.ba_iban = ba_iban;
	}
	public String getBa_swift_bic() {
		return ba_swift_bic;
	}
	public void setBa_swift_bic(String ba_swift_bic) {
		this.ba_swift_bic = ba_swift_bic;
	}    
}

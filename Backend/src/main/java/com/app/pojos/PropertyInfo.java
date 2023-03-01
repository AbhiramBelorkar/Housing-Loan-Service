package com.app.pojos;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PropertyInfo {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer propertyId;
	private String propertyType;
	private Double propertyArea;
	private Double constructionArea;
	private Double propertyPrice;
    private Double constructionPrice;
    @Lob
    private byte[] propertyDocuments;
    @Lob
    private byte[]priceProofs;
    
    @OneToOne(cascade = CascadeType.ALL)
    private PropertyAddress propertyAddress;
    

}

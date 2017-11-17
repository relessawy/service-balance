<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="xml" indent="yes" />
	<xsl:param name="Parse-XML" />

	<xsl:template match="/">
		<pfx17:GetServiceBalanceListVBMResponse
			xmlns:pfx61="http://www.tibco.com/ns/no_namespace_schema_location/BILLING/Processes/EAI/getContractHistory/Schemas/SP_getContractHistory_output.xsd"
			xmlns:pfx16="http://www.tibco.com/schemas/Vodafone/CSM/Egypt/Common.xsd"
			xmlns:pfx15="http://www.tibco.com/ns/no_namespace_schema_location/CSM/Processes/ServiceBalance/Operations/GetServiceBalanceList/Schemas/GetPrepaidProfileResponse.xsd"
			xmlns:ns="http://www.tibco.com/pe/DeployedVarsType"
			xmlns:pfx14="http://www.tibco.com/ns/no_namespace_schema_location/CSM/Processes/ServiceBalance/Operations/GetServiceBalanceList/Schemas/GetPrepaidProfile.xsd"
			xmlns:pfx13="http://xmlns.vfe.com.eg/EAI/celfocus/requestEAI"
			xmlns:pfx12="http://vfe.com.eg/PromoEngine/UnifiedGetGiftsHistory/xsd/v1"
			xmlns:pfx11="http://www.tibco.com/ns/no_namespace_schema_location/CUSTOMER_INFO/Processes/EAI/GetAggregatedUsageProfile/Schemas/SP_OUTPUT.xsd"
			xmlns:pfx10="http://vfe.com.eg/ODS/CustomerInfo/GetUsageAggregatedProfile/xsd/v1"
			xmlns:pfx41="http://www.tibco.com/ns/no_namespace_schema_location/ODS/Processes/EAI/GetProactiveRecommendedRatePlan/Schemas/SP_GetProactiveRecommendedRatePlan_output.xsd"
			xmlns:ns22="http://vfe.com.eg/Common/Schemas/CustomError/V1"
			xmlns:pfx19="http://group.vodafone.com/schema/extension/vbo/service/service-balance/v1"
			xmlns:pfx18="http://group.vodafone.com/schema/common/v1"
			xmlns:pfx17="http://group.vodafone.com/schema/vbm/service/service-balance/v1"
			xmlns:pfx5="http://www.tibco.com/schemas/CommonResources/SchemaDefinitions/NameValuePairs.xsd"
			xmlns:pfx31="http://www.tibco.com/ns/no_namespace_schema_location/BILLING/Processes/EAI/GetProactiveRecommendedRatePlan/Schemas/SP_GetProactiveRecommendedRatePlan_output.xsd"
			xmlns:pfx32="http://www.tibco.com/ns/no_namespace_schema_location/BILLING/Processes/EAI/GetAggregatedUsageProfile/Schemas/SP_GetAggregatedUsageProfile_output.xsd"
			xmlns:pfx4="http://www.tibco.com/ns/no_namespace_schema_location/ODS/Processes/EAI/GetAggregatedUsageProfile/Schemas/SP_GetAggregatedUsageProfile_output.xsd"
			xmlns:tib="http://www.tibco.com/bw/xslt/custom-functions" xmlns:pfx3="http://service.siebelpromos.asset.com/"
			xmlns:pfx2="http://xmlns.vfe.com.eg/EAI/celfocus"
			xmlns:MSISDNNewRange="java://eg.com.vfe.tibco.xpath.MSISDNController"
			xmlns:pfx9="http://service.promos.asset.com/"
			xmlns:pfx8="http://www.tibco.com/ns/no_namespace_schema_location/ODS/Processes/EAI/GetAggregatedUsageProfile/Schemas/Get_MP_CU_RECOM_Schema.xsd"
			xmlns:pfx7="http://xmlns.vfe.com.eg/EAI/celfocus/responseEAI"
			xmlns:pfx6="http://www.tibco.com/ns/no_namespace_schema_location/PromoEngine/Processes/EAI/UnifiedGetGiftsHistory/Schemas/SPResults.xsd"
			xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
			xmlns:ns9="http://group.vodafone.com/schema/vbo/service/service-balance/v1"
			xmlns:ns5="http://vfe.com.eg/schemas/PromoEngine/Resources/Schemas/Unification/v1"
			xmlns:pfx91="http://vfe.com.eg/ODS/CustomerInfo/GetContractProfile/xsd/v1"
			xmlns:ns12="http://www.tibco.com/pe/GenerateErrorActivity/InputSchema"
			xmlns:ns6="http://vfe.com.eg/Common/Schemas/EAI/ResponseHeader/v1"
			xmlns:ns10="urn:un:unece:uncefact:documentation:standard:CoreComponentType:2"
			xmlns:pfx="http://xmlns.Filipe.Pateiro.pt/2005" xmlns:ns7="http://vfe.com.eg/Common/Schemas/EAI/RequestHeader/v1"
			xmlns:ns8="http://group.vodafone.com/contract/vho/header/v1"
			xmlns:ns11="http://docs.oasis-open.org/wsrf/bf-2"
			xmlns:ns51="http://vfe.com.eg/ODS/Schemas/CustomerInfo/UsageProfile/v1"
			xmlns:pd="http://xmlns.tibco.com/bw/process/2003" xmlns:ns2="http://www.tibco.com/pe/EngineTypes"
			xmlns:ns1="http://schemas.tibco.com/bw/plugins/jdbc/5.0/jdbcExceptions"
			xmlns:ns4="http://xmlns.vfe.com.eg/EAI/celfocus/COM" xmlns:ns3="http://xmlns.vfe.com.eg/EAI/celfocus/Common/writeLog"
			xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:pfx20="http://group.vodafone.com/contract/vfo/fault/v1"
			xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
			<xsl:for-each select="$Parse-XML/Response/TARIFF_INFO">
				<pfx17:ServiceBalanceVBO>
					<pfx18:IDs>
						<pfx18:ID>
							<xsl:attribute name="schemeName">
                        <xsl:value-of select="'ServiceClassID'" />
                    </xsl:attribute>
							<xsl:value-of select="ServiceClassID" />
						</pfx18:ID>
					</pfx18:IDs>
					<pfx18:Type>
						<xsl:value-of select="'TARIFF'" />
					</pfx18:Type>
					<ns9:Details>
						<ns9:Allowance>
							<ns9:Type>
								<xsl:value-of select="&quot;CreditLimit&quot;" />
							</ns9:Type>
							<xsl:if test="Balances/RemainingLimit">
								<ns9:AvailableAllowance>
									<xsl:value-of select="Balances/RemainingLimit" />
								</ns9:AvailableAllowance>
							</xsl:if>
							<xsl:if test="Balances/ConsumedLimit">
								<ns9:UsedAllowance>
									<xsl:value-of select="Balances/ConsumedLimit" />
								</ns9:UsedAllowance>
							</xsl:if>
						</ns9:Allowance>
						<ns9:BalanceAmount>
							<xsl:if test="Balances/RechargeBalance">
								<ns9:Amount>
									<xsl:value-of select="Balances/RechargeBalance" />
								</ns9:Amount>
							</xsl:if>
						</ns9:BalanceAmount>
					</ns9:Details>
					<ns9:Parts>
						<ns9:CustomerAccount>
							<pfx18:Categories>
								<pfx18:Category>
									<xsl:attribute name="name">
                                <xsl:value-of select="'RXFlag'" />
                            </xsl:attribute>
									<xsl:value-of select="RX_Flag" />
								</pfx18:Category>
								<pfx18:Category>
									<xsl:attribute name="name">
                                <xsl:value-of select="'BillCycle'" />
                            </xsl:attribute>
									<xsl:value-of select="BillCycle" />
								</pfx18:Category>
							</pfx18:Categories>
							<xsl:if test="Property[Name='CustomerStatus']/Value">
								<pfx18:Status>
									<xsl:value-of select="Property[Name='CustomerStatus']/Value" />
								</pfx18:Status>
							</xsl:if>
							<ns9:Extension>
								<pfx19:LanguageID>
									<xsl:value-of select="LanguageID" />
								</pfx19:LanguageID>
							</ns9:Extension>
						</ns9:CustomerAccount>
					</ns9:Parts>
				</pfx17:ServiceBalanceVBO>
			</xsl:for-each>
			<xsl:for-each select="$Parse-XML/Response/Products/Product">
				<pfx17:ServiceBalanceVBO>
					<pfx18:IDs>
						<pfx18:ID>
							<xsl:attribute name="schemeName">
                        <xsl:value-of select="'ProductID'" />
                    </xsl:attribute>
							<xsl:value-of select="ProductID" />
						</pfx18:ID>
					</pfx18:IDs>
					<xsl:if test="ProductName">
						<pfx18:Name>
							<xsl:value-of select="ProductName" />
						</pfx18:Name>
					</xsl:if>
					<xsl:if test="ProductType">
						<pfx18:Type>
							<xsl:value-of select="ProductType" />
						</pfx18:Type>
					</xsl:if>
					<pfx18:Categories>
						<pfx18:Category>
							<xsl:attribute name="name">
                        <xsl:value-of select="'RECURRENCE'" />
                    </xsl:attribute>
							<xsl:value-of select="ProductRECURRENCE" />
						</pfx18:Category>
					</pfx18:Categories>
					<xsl:if test="ProductStatus">
						<pfx18:Status>
							<xsl:value-of select="ProductStatus" />
						</pfx18:Status>
					</xsl:if>
					<pfx18:ValidityPeriod>
						<pfx18:FromDate>
							<ns10:DateString>
								<xsl:value-of select="ProductStartDate" />
							</ns10:DateString>
						</pfx18:FromDate>
						<pfx18:ToDate>
							<ns10:DateString>
								<xsl:value-of select="ProductExpiryDate" />
							</ns10:DateString>
						</pfx18:ToDate>
					</pfx18:ValidityPeriod>
					<ns9:Details>
						<xsl:for-each select="Quota">
							<ns9:Allowance>
								<xsl:if test="QuotaType">
									<ns9:Type>
										<xsl:attribute name="name">
                                    <xsl:value-of
											select="concat(../ProductName, ' ' ,QuotaName)" />
                                </xsl:attribute>
										<xsl:value-of select="QuotaType" />
									</ns9:Type>
								</xsl:if>
								<xsl:if test="Location">
									<ns9:Category>
										<xsl:attribute name="name">
                                    <xsl:value-of select="'Location'" />
                                </xsl:attribute>
										<xsl:value-of select="Location" />
									</ns9:Category>
								</xsl:if>
								<xsl:if test="RemainingQuota">
									<ns9:AvailableAllowance>
										<xsl:if test="QuotaUnit">
											<xsl:attribute name="unitCode">
                                        <xsl:value-of
												select="QuotaUnit" />
                                    </xsl:attribute>
										</xsl:if>
										<xsl:value-of select="RemainingQuota" />
									</ns9:AvailableAllowance>
								</xsl:if>
								<xsl:if test="ConsumedQuota">
									<ns9:UsedAllowance>
										<xsl:if test="QuotaUnit">
											<xsl:attribute name="unitCode">
                                        <xsl:value-of
												select="QuotaUnit" />
                                    </xsl:attribute>
										</xsl:if>
										<xsl:value-of select="ConsumedQuota" />
									</ns9:UsedAllowance>
								</xsl:if>
							</ns9:Allowance>
						</xsl:for-each>
						<xsl:if test="ProductRenewalDate">
							<ns9:ResetDate>
								<xsl:value-of select="ProductRenewalDate" />
							</ns9:ResetDate>
						</xsl:if>
					</ns9:Details>
				</pfx17:ServiceBalanceVBO>
			</xsl:for-each>
		</pfx17:GetServiceBalanceListVBMResponse>
	</xsl:template>
</xsl:stylesheet>

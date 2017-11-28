<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="xml" indent="yes" />

	<xsl:param name="trackingID" />
	<xsl:param name="eType" />
	<xsl:param name="message" />

	<xsl:template match="/">
		<pfx3:EAI__HEADER__LOG
			xmlns:BW="java://com.tibco.pe.core.JavaCustomXPATHFunctions"
			xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:ns="http://www.tibco.com/pe/DeployedVarsType"
			xmlns:pfx="http://xmlns.Filipe.Pateiro.pt/2005" xmlns:pd="http://xmlns.tibco.com/bw/process/2003"
			xmlns:ns2="http://www.tibco.com/namespaces/tnt/plugins/file"
			xmlns:ns1="http://www.tibco.com/pe/EngineTypes"
			xmlns:ns4="http://xmlns.vfe.com.eg/EAI/celfocus/Common/globalVariables"
			xmlns:ns3="http://www.tibco.com/pe/WriteToLogActivitySchema"
			xmlns:pfx5="http://xmlns.vfe.com.eg/EAI/celfocus/Common/writeLog"
			xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:tib="http://www.tibco.com/bw/xslt/custom-functions"
			xmlns:pfx3="http://www.tibco.com/xmlns/ae2xsd/2002/05/ae/ADB/ADB_ERRORLOG_SUB"
			xmlns:pfx2="www.tibco.com/plugin/java/JavaMethodActivityInput"
			xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
			<TRACKINGID>
				<xsl:value-of select="$trackingID" />
			</TRACKINGID>
			<COMPONENT>
				<xsl:value-of select="'FUSE_ENGINE'" />
			</COMPONENT>
			<SERVICE>
				<xsl:value-of select="'SERVICE_NAME'" />
			</SERVICE>
			<USERNAME>
				<xsl:value-of select="'USER_NAME'" />
			</USERNAME>
			<DATETIME>
				<dateTime>2017-11-28 08:45:25.000</dateTime>
			</DATETIME>
			<ENTITY>
				<xsl:value-of select="'ENTITY'" />
			</ENTITY>
			<KEY>
				<xsl:value-of select="'KEY'" />
			</KEY>
			<DESCRIPTION>
				<xsl:value-of select="'DESCRIPTION'" />
			</DESCRIPTION>
			<ENDDATETIME>
				<dateTime>2017-11-28 08:45:25.000</dateTime>
			</ENDDATETIME>
			<ADB__SEQUENCE__EAI__LOG>
				<item>
					<DATETIME>
						<dateTime>2017-11-28 08:45:25.000</dateTime>
					</DATETIME>
					<TRACKINGID>
						<xsl:value-of select="$trackingID" />
					</TRACKINGID>
					<COMPONENT>
						<xsl:value-of select="'FUSE_ENGINE'" />
					</COMPONENT>
					<SERVICE>
						<xsl:value-of select="'SERVICE_NAME'" />
					</SERVICE>
					<xsl:if test="eType">
						<ETYPE>
							<xsl:value-of select="eType" />
						</ETYPE>
					</xsl:if>
					<MSG>
						<xsl:value-of select="$message" />
					</MSG>
					<ADB__OPCODE>
						<xsl:value-of select="1" />
					</ADB__OPCODE>
				</item>
			</ADB__SEQUENCE__EAI__LOG>
			<ADB__OPCODE>
				<xsl:value-of select="1" />
			</ADB__OPCODE>
		</pfx3:EAI__HEADER__LOG>
	</xsl:template>
</xsl:stylesheet>
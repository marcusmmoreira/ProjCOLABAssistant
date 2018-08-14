package br.univille.projcolabassistant.service;

import java.io.File;
import java.util.Date;

public interface ReportService {
	File generateUserReport(String nameFilter, String emailFilter, String typeFilter, boolean isOrderByDesc);
	File generateInstitutionReport(String nameFilter, String emailFilter, String cityFilter);
	File generateOrderReport(Date creationDateStart, Date creationDateEnd, Date finishedDateStart, Date finishedDateEnd, String userName, Integer status, Boolean isOrderByDesc);
	File generateAcessoryCategoryReport();
}

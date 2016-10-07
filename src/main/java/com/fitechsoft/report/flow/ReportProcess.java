package com.fitechsoft.report.flow;

import com.fitechsoft.flow.core.FFProcess;

import java.util.Map;

/**
 * Created by chun on 2016/10/7.
 */
public class ReportProcess extends FFProcess {

    public static final String REPORT_PROCESS = "REPORT_PROCESS";
    protected static final String REPORT_PROCESS_BPPMN = "resources/processes/report.bpmn";
    protected static final String REPORT_CATEGORY = "REPORT_CATEGORY";

    public ReportProcess(){
        super(REPORT_PROCESS, REPORT_PROCESS_BPPMN,REPORT_CATEGORY);
        super.deploy();
    }

}

package org.cidisi.bpmn.extension.modeltocode.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_main implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_main() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_8_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            8, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "org.eclipse.jet.taglib.control.iterateSetsContext", //$NON-NLS-1$
                "true()", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_29_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            29, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "target", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
            },
            new String[] {
                "resources/BPMN20.xsd", //$NON-NLS-1$
                "{$org.eclipse.jet.resource.project.name}/model/BPMN20.xsd", //$NON-NLS-1$
                "false", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_30_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            30, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "target", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
            },
            new String[] {
                "resources/BPMNDI.xsd", //$NON-NLS-1$
                "{$org.eclipse.jet.resource.project.name}/model/BPMNDI.xsd", //$NON-NLS-1$
                "false", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_31_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            31, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "target", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
            },
            new String[] {
                "resources/DI.xsd", //$NON-NLS-1$
                "{$org.eclipse.jet.resource.project.name}/model/DI.xsd", //$NON-NLS-1$
                "false", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_32_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            32, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "target", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
            },
            new String[] {
                "resources/DC.xsd", //$NON-NLS-1$
                "{$org.eclipse.jet.resource.project.name}/model/DC.xsd", //$NON-NLS-1$
                "false", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_33_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            33, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "target", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
            },
            new String[] {
                "resources/Semantic.xsd", //$NON-NLS-1$
                "{$org.eclipse.jet.resource.project.name}/model/Semantic.xsd", //$NON-NLS-1$
                "false", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_35_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            35, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "concat($org.eclipse.jet.resource.project.name, '/model/', /Schema/@targetNamespace, '.xsd')", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_log_36_1 = new TagInfo("c:log", //$NON-NLS-1$
            36, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_37_2 = new TagInfo("c:get", //$NON-NLS-1$
            37, 2,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$path", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_40_1 = new TagInfo("ws:file", //$NON-NLS-1$
            40, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/simpleXsdToCode.xsd.jet", //$NON-NLS-1$
                "{$path}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_42_1 = new TagInfo("c:if", //$NON-NLS-1$
            42, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "isVariableDefined('org.eclipse.jet.resource.project.name')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_43_5 = new TagInfo("ws:file", //$NON-NLS-1$
            43, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/dump.jet", //$NON-NLS-1$
                "{$org.eclipse.jet.resource.project.name}/model/dump.xml", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_rebuildWorkspace_46_1 = new TagInfo("ws:rebuildWorkspace", //$NON-NLS-1$
            46, 1,
            new String[] {
            },
            new String[] {
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // Main entry point for org.cidisi.bpmn.extension.modeltocode 
        out.write(NL);         
        // 
        //  Let c:iterate tags set the XPath context object.
        //  For 100% compatibility with JET 0.9.x or earlier, remove this statement
        // 
        RuntimeTagElement _jettag_c_setVariable_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_8_1.setRuntimeParent(null);
        _jettag_c_setVariable_8_1.setTagInfo(_td_c_setVariable_8_1);
        _jettag_c_setVariable_8_1.doStart(context, out);
        _jettag_c_setVariable_8_1.doEnd();
        out.write(NL);         
        // 
        //TODO: traverse input model, performing calculations and storing 
        //the results as model annotations via c:set tag 
        out.write(NL);         
        out.write(NL);         
        //
        //TODO: traverse annotated model, performing text generation actions 
        //such as ws:file, ws:folder and ws:project 
        out.write("   ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        // For debug purposes, dump the annotated input model in 
        //   the root of the project containing the original input model.
        //   
        //   Note that model formatting may not be identical, and that in
        //   the case of non-XML input models, the dump may look quite different.
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_29_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_29_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_29_1.setRuntimeParent(null);
        _jettag_ws_copyFile_29_1.setTagInfo(_td_ws_copyFile_29_1);
        _jettag_ws_copyFile_29_1.doStart(context, out);
        _jettag_ws_copyFile_29_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_30_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_30_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_30_1.setRuntimeParent(null);
        _jettag_ws_copyFile_30_1.setTagInfo(_td_ws_copyFile_30_1);
        _jettag_ws_copyFile_30_1.doStart(context, out);
        _jettag_ws_copyFile_30_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_31_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_31_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_31_1.setRuntimeParent(null);
        _jettag_ws_copyFile_31_1.setTagInfo(_td_ws_copyFile_31_1);
        _jettag_ws_copyFile_31_1.doStart(context, out);
        _jettag_ws_copyFile_31_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_32_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_32_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_32_1.setRuntimeParent(null);
        _jettag_ws_copyFile_32_1.setTagInfo(_td_ws_copyFile_32_1);
        _jettag_ws_copyFile_32_1.doStart(context, out);
        _jettag_ws_copyFile_32_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_33_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_33_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_33_1.setRuntimeParent(null);
        _jettag_ws_copyFile_33_1.setTagInfo(_td_ws_copyFile_33_1);
        _jettag_ws_copyFile_33_1.doStart(context, out);
        _jettag_ws_copyFile_33_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_35_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_35_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_35_1.setRuntimeParent(null);
        _jettag_c_setVariable_35_1.setTagInfo(_td_c_setVariable_35_1);
        _jettag_c_setVariable_35_1.doStart(context, out);
        _jettag_c_setVariable_35_1.doEnd();
        RuntimeTagElement _jettag_c_log_36_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "log", "c:log", _td_c_log_36_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_log_36_1.setRuntimeParent(null);
        _jettag_c_log_36_1.setTagInfo(_td_c_log_36_1);
        _jettag_c_log_36_1.doStart(context, out);
        JET2Writer _jettag_c_log_36_1_saved_out = out;
        while (_jettag_c_log_36_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_37_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_37_2.setRuntimeParent(_jettag_c_log_36_1);
            _jettag_c_get_37_2.setTagInfo(_td_c_get_37_2);
            _jettag_c_get_37_2.doStart(context, out);
            _jettag_c_get_37_2.doEnd();
            out.write(NL);         
            _jettag_c_log_36_1.handleBodyContent(out);
        }
        out = _jettag_c_log_36_1_saved_out;
        _jettag_c_log_36_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_file_40_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_40_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_40_1.setRuntimeParent(null);
        _jettag_ws_file_40_1.setTagInfo(_td_ws_file_40_1);
        _jettag_ws_file_40_1.doStart(context, out);
        _jettag_ws_file_40_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_42_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_42_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_42_1.setRuntimeParent(null);
        _jettag_c_if_42_1.setTagInfo(_td_c_if_42_1);
        _jettag_c_if_42_1.doStart(context, out);
        while (_jettag_c_if_42_1.okToProcessBody()) {
            out.write("    ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_43_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_43_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_43_5.setRuntimeParent(_jettag_c_if_42_1);
            _jettag_ws_file_43_5.setTagInfo(_td_ws_file_43_5);
            _jettag_ws_file_43_5.doStart(context, out);
            _jettag_ws_file_43_5.doEnd();
            out.write(NL);         
            _jettag_c_if_42_1.handleBodyContent(out);
        }
        _jettag_c_if_42_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_rebuildWorkspace_46_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "rebuildWorkspace", "ws:rebuildWorkspace", _td_ws_rebuildWorkspace_46_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_rebuildWorkspace_46_1.setRuntimeParent(null);
        _jettag_ws_rebuildWorkspace_46_1.setTagInfo(_td_ws_rebuildWorkspace_46_1);
        _jettag_ws_rebuildWorkspace_46_1.doStart(context, out);
        _jettag_ws_rebuildWorkspace_46_1.doEnd();
    }
}
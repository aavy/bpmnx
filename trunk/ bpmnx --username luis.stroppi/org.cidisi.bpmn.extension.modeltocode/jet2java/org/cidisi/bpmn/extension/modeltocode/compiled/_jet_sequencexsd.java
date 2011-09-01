package org.cidisi.bpmn.extension.modeltocode.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_sequencexsd implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_sequencexsd() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_choose_1_1 = new TagInfo("c:choose", //$NON-NLS-1$
            1, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_2_2 = new TagInfo("c:when", //$NON-NLS-1$
            2, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($particles) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_4_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            4, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$particles", //$NON-NLS-1$
                "p", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_24 = new TagInfo("c:get", //$NON-NLS-1$
            5, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$p/elementDeclaration/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_78 = new TagInfo("c:get", //$NON-NLS-1$
            5, 78,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$p/elementDeclaration/typeDefinition/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_choose_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_1_1.setRuntimeParent(null);
        _jettag_c_choose_1_1.setTagInfo(_td_c_choose_1_1);
        _jettag_c_choose_1_1.doStart(context, out);
        JET2Writer _jettag_c_choose_1_1_saved_out = out;
        while (_jettag_c_choose_1_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_2_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_2_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_2_2.setRuntimeParent(_jettag_c_choose_1_1);
            _jettag_c_when_2_2.setTagInfo(_td_c_when_2_2);
            _jettag_c_when_2_2.doStart(context, out);
            JET2Writer _jettag_c_when_2_2_saved_out = out;
            while (_jettag_c_when_2_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t<sequence>");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_4_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_4_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_4_4.setRuntimeParent(_jettag_c_when_2_2);
                _jettag_c_iterate_4_4.setTagInfo(_td_c_iterate_4_4);
                _jettag_c_iterate_4_4.doStart(context, out);
                while (_jettag_c_iterate_4_4.okToProcessBody()) {
                    out.write("\t\t\t\t<xsd:element name=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_5_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_24); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_5_24.setRuntimeParent(_jettag_c_iterate_4_4);
                    _jettag_c_get_5_24.setTagInfo(_td_c_get_5_24);
                    _jettag_c_get_5_24.doStart(context, out);
                    _jettag_c_get_5_24.doEnd();
                    out.write("\" type=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_5_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_78); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_5_78.setRuntimeParent(_jettag_c_iterate_4_4);
                    _jettag_c_get_5_78.setTagInfo(_td_c_get_5_78);
                    _jettag_c_get_5_78.doStart(context, out);
                    _jettag_c_get_5_78.doEnd();
                    out.write("\"/>");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_iterate_4_4.handleBodyContent(out);
                }
                _jettag_c_iterate_4_4.doEnd();
                out.write("\t\t</sequence>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_2_2.handleBodyContent(out);
            }
            out = _jettag_c_when_2_2_saved_out;
            _jettag_c_when_2_2.doEnd();
            _jettag_c_choose_1_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_1_1_saved_out;
        _jettag_c_choose_1_1.doEnd();
    }
}

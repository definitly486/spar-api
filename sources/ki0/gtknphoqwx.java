package ki0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.networkpanel.impl.domain.model.NetworkPayload;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gtknphoqwx {
    public static final List iobyxmoadg(NetworkPayload networkPayload, boolean z13, boolean z14) {
        List listMhtqkkgtqm;
        List listWflxmlrfwp;
        zdlpuopuiu.btonecajqb(networkPayload, "<this>");
        List listPpxfxbqfkf = jyumaefscl.ppxfxbqfkf();
        listPpxfxbqfkf.add(new btonecajqb.zoijcleaow(btonecajqb.zoijcleaow.iobyxmoadg.HEADERS, z13));
        List listWflxmlrfwp2 = null;
        if (z13) {
            List headers = networkPayload.getHeaders();
            if (headers != null) {
                listWflxmlrfwp = new ArrayList(jyumaefscl.cqumvgiudr(headers, 10));
                Iterator it = headers.iterator();
                while (it.hasNext()) {
                    listWflxmlrfwp.add(new btonecajqb.iobyxmoadg((String) it.next()));
                }
            } else {
                listWflxmlrfwp = null;
            }
            if (listWflxmlrfwp == null) {
                listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
            }
            listPpxfxbqfkf.addAll(listWflxmlrfwp);
        }
        listPpxfxbqfkf.add(new btonecajqb.zoijcleaow(btonecajqb.zoijcleaow.iobyxmoadg.BODY, z14));
        if (z14) {
            String body = networkPayload.getBody();
            if (body != null && (listMhtqkkgtqm = kcexrzcfyt.mhtqkkgtqm(body, new char[]{'\n'}, false, 0, 6, null)) != null) {
                listWflxmlrfwp2 = new ArrayList(jyumaefscl.cqumvgiudr(listMhtqkkgtqm, 10));
                Iterator it2 = listMhtqkkgtqm.iterator();
                while (it2.hasNext()) {
                    listWflxmlrfwp2.add(new btonecajqb.iobyxmoadg((String) it2.next()));
                }
            }
            if (listWflxmlrfwp2 == null) {
                listWflxmlrfwp2 = jyumaefscl.wflxmlrfwp();
            }
            listPpxfxbqfkf.addAll(listWflxmlrfwp2);
        }
        return jyumaefscl.iobyxmoadg(listPpxfxbqfkf);
    }
}

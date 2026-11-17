package oc;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc implements nc.zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final mc.ppxfxbqfkf f72581eablkybsjg = new mc.ppxfxbqfkf() { // from class: oc.iobyxmoadg
        @Override // mc.ppxfxbqfkf
        public final void encode(Object obj, Object obj2) {
            wkgbmnqykc.gtknphoqwx(obj, (mc.wkgbmnqykc) obj2);
        }
    };

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final mc.eablkybsjg f72582gxszxtbevo = new mc.eablkybsjg() { // from class: oc.zoijcleaow
        @Override // mc.eablkybsjg
        public final void encode(Object obj, Object obj2) {
            ((mc.gxszxtbevo) obj2).add((String) obj);
        }
    };

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final mc.eablkybsjg f72583lqeggnwhkg = new mc.eablkybsjg() { // from class: oc.ppxfxbqfkf
        @Override // mc.eablkybsjg
        public final void encode(Object obj, Object obj2) {
            wkgbmnqykc.wflxmlrfwp((Boolean) obj, (mc.gxszxtbevo) obj2);
        }
    };

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final zoijcleaow f72584nufgyqmvbu = new zoijcleaow(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f72585iobyxmoadg = new HashMap();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f72588zoijcleaow = new HashMap();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private mc.ppxfxbqfkf f72586ppxfxbqfkf = f72581eablkybsjg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f72587wkgbmnqykc = false;

    class iobyxmoadg implements mc.iobyxmoadg {
        iobyxmoadg() {
        }

        @Override // mc.iobyxmoadg
        public void iobyxmoadg(Object obj, Writer writer) {
            eablkybsjg eablkybsjgVar = new eablkybsjg(writer, wkgbmnqykc.this.f72585iobyxmoadg, wkgbmnqykc.this.f72588zoijcleaow, wkgbmnqykc.this.f72586ppxfxbqfkf, wkgbmnqykc.this.f72587wkgbmnqykc);
            eablkybsjgVar.wkgbmnqykc(obj, false);
            eablkybsjgVar.agtfadlqog();
        }

        @Override // mc.iobyxmoadg
        public String zoijcleaow(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                iobyxmoadg(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    private static final class zoijcleaow implements mc.eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static final DateFormat f72590iobyxmoadg;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f72590iobyxmoadg = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private zoijcleaow() {
        }

        @Override // mc.eablkybsjg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void encode(Date date, mc.gxszxtbevo gxszxtbevoVar) {
            gxszxtbevoVar.add(f72590iobyxmoadg.format(date));
        }

        /* synthetic */ zoijcleaow(iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    public wkgbmnqykc() {
        ojitshcjhn(String.class, f72582gxszxtbevo);
        ojitshcjhn(Boolean.class, f72583lqeggnwhkg);
        ojitshcjhn(Date.class, f72584nufgyqmvbu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void gtknphoqwx(Object obj, mc.wkgbmnqykc wkgbmnqykcVar) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void wflxmlrfwp(Boolean bool, mc.gxszxtbevo gxszxtbevoVar) {
        gxszxtbevoVar.add(bool.booleanValue());
    }

    @Override // nc.zoijcleaow
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public wkgbmnqykc registerEncoder(Class cls, mc.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f72585iobyxmoadg.put(cls, ppxfxbqfkfVar);
        this.f72588zoijcleaow.remove(cls);
        return this;
    }

    public wkgbmnqykc btonecajqb(boolean z13) {
        this.f72587wkgbmnqykc = z13;
        return this;
    }

    public wkgbmnqykc dxjokdxxww(nc.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.configure(this);
        return this;
    }

    public mc.iobyxmoadg nufgyqmvbu() {
        return new iobyxmoadg();
    }

    public wkgbmnqykc ojitshcjhn(Class cls, mc.eablkybsjg eablkybsjgVar) {
        this.f72588zoijcleaow.put(cls, eablkybsjgVar);
        this.f72585iobyxmoadg.remove(cls);
        return this;
    }
}

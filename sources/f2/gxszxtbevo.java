package f2;

import androidx.datastore.preferences.protobuf.czzsidtyhn;
import androidx.datastore.preferences.protobuf.kcexrzcfyt;
import androidx.datastore.preferences.protobuf.pmvmpeiblj;
import androidx.datastore.preferences.protobuf.wypolnanlu;
import androidx.datastore.preferences.protobuf.ylkuphrtab;
import androidx.datastore.preferences.protobuf.zynmafqrjb;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo extends kcexrzcfyt implements ylkuphrtab {
    private static final gxszxtbevo DEFAULT_INSTANCE;
    private static volatile wypolnanlu PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private zynmafqrjb preferences_ = zynmafqrjb.draadjrbmk();

    public static final class iobyxmoadg extends kcexrzcfyt.iobyxmoadg implements ylkuphrtab {
        /* synthetic */ iobyxmoadg(eablkybsjg eablkybsjgVar) {
            this();
        }

        public iobyxmoadg vdvldrhtss(String str, nufgyqmvbu nufgyqmvbuVar) {
            str.getClass();
            nufgyqmvbuVar.getClass();
            draadjrbmk();
            ((gxszxtbevo) this.f8683yggfygwlhe).cdpycssgdh().put(str, nufgyqmvbuVar);
            return this;
        }

        private iobyxmoadg() {
            super(gxszxtbevo.DEFAULT_INSTANCE);
        }
    }

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final pmvmpeiblj f32577iobyxmoadg = pmvmpeiblj.wkgbmnqykc(czzsidtyhn.zoijcleaow.f8604cdpycssgdh, "", czzsidtyhn.zoijcleaow.f8610iozdgvuglv, nufgyqmvbu.jpowsppfya());
    }

    static {
        gxszxtbevo gxszxtbevoVar = new gxszxtbevo();
        DEFAULT_INSTANCE = gxszxtbevoVar;
        kcexrzcfyt.lereixgezr(gxszxtbevo.class, gxszxtbevoVar);
    }

    private gxszxtbevo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map cdpycssgdh() {
        return iozdgvuglv();
    }

    private zynmafqrjb iozdgvuglv() {
        if (!this.preferences_.vdvldrhtss()) {
            this.preferences_ = this.preferences_.jyumaefscl();
        }
        return this.preferences_;
    }

    private zynmafqrjb lmojexxdyd() {
        return this.preferences_;
    }

    public static gxszxtbevo pkzmftpjix(InputStream inputStream) {
        return (gxszxtbevo) kcexrzcfyt.cqumvgiudr(DEFAULT_INSTANCE, inputStream);
    }

    public static iobyxmoadg ylkuphrtab() {
        return (iobyxmoadg) DEFAULT_INSTANCE.btonecajqb();
    }

    @Override // androidx.datastore.preferences.protobuf.kcexrzcfyt
    protected final Object wflxmlrfwp(kcexrzcfyt.wkgbmnqykc wkgbmnqykcVar, Object obj, Object obj2) {
        eablkybsjg eablkybsjgVar = null;
        switch (eablkybsjg.f32576iobyxmoadg[wkgbmnqykcVar.ordinal()]) {
            case 1:
                return new gxszxtbevo();
            case 2:
                return new iobyxmoadg(eablkybsjgVar);
            case 3:
                return kcexrzcfyt.iwizpuwonk(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", zoijcleaow.f32577iobyxmoadg});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                wypolnanlu zoijcleaowVar = PARSER;
                if (zoijcleaowVar == null) {
                    synchronized (gxszxtbevo.class) {
                        try {
                            zoijcleaowVar = PARSER;
                            if (zoijcleaowVar == null) {
                                zoijcleaowVar = new kcexrzcfyt.zoijcleaow(DEFAULT_INSTANCE);
                                PARSER = zoijcleaowVar;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return zoijcleaowVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public Map yadqdtsiqt() {
        return Collections.unmodifiableMap(lmojexxdyd());
    }
}

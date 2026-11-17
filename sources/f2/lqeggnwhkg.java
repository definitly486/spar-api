package f2;

import androidx.datastore.preferences.protobuf.kcexrzcfyt;
import androidx.datastore.preferences.protobuf.wypolnanlu;
import androidx.datastore.preferences.protobuf.ylkuphrtab;
import androidx.datastore.preferences.protobuf.zdlpuopuiu;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg extends kcexrzcfyt implements ylkuphrtab {
    private static final lqeggnwhkg DEFAULT_INSTANCE;
    private static volatile wypolnanlu PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private zdlpuopuiu.zoijcleaow strings_ = kcexrzcfyt.agtfadlqog();

    public static final class iobyxmoadg extends kcexrzcfyt.iobyxmoadg implements ylkuphrtab {
        /* synthetic */ iobyxmoadg(eablkybsjg eablkybsjgVar) {
            this();
        }

        public iobyxmoadg vdvldrhtss(Iterable iterable) {
            draadjrbmk();
            ((lqeggnwhkg) this.f8683yggfygwlhe).cdpycssgdh(iterable);
            return this;
        }

        private iobyxmoadg() {
            super(lqeggnwhkg.DEFAULT_INSTANCE);
        }
    }

    static {
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg();
        DEFAULT_INSTANCE = lqeggnwhkgVar;
        kcexrzcfyt.lereixgezr(lqeggnwhkg.class, lqeggnwhkgVar);
    }

    private lqeggnwhkg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cdpycssgdh(Iterable iterable) {
        yadqdtsiqt();
        androidx.datastore.preferences.protobuf.iobyxmoadg.zoijcleaow(iterable, this.strings_);
    }

    public static lqeggnwhkg iozdgvuglv() {
        return DEFAULT_INSTANCE;
    }

    private void yadqdtsiqt() {
        if (this.strings_.isModifiable()) {
            return;
        }
        this.strings_ = kcexrzcfyt.yggfygwlhe(this.strings_);
    }

    public static iobyxmoadg ylkuphrtab() {
        return (iobyxmoadg) DEFAULT_INSTANCE.btonecajqb();
    }

    public List lmojexxdyd() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.kcexrzcfyt
    protected final Object wflxmlrfwp(kcexrzcfyt.wkgbmnqykc wkgbmnqykcVar, Object obj, Object obj2) {
        eablkybsjg eablkybsjgVar = null;
        switch (eablkybsjg.f32576iobyxmoadg[wkgbmnqykcVar.ordinal()]) {
            case 1:
                return new lqeggnwhkg();
            case 2:
                return new iobyxmoadg(eablkybsjgVar);
            case 3:
                return kcexrzcfyt.iwizpuwonk(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                wypolnanlu zoijcleaowVar = PARSER;
                if (zoijcleaowVar == null) {
                    synchronized (lqeggnwhkg.class) {
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
}

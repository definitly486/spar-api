package xa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final xa.ppxfxbqfkf f121855iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ppxfxbqfkf f121856ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f121857wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f121858zoijcleaow;

    class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ xa.ppxfxbqfkf f121859iobyxmoadg;

        /* JADX INFO: renamed from: xa.ojitshcjhn$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        class C3065iobyxmoadg extends zoijcleaow {
            C3065iobyxmoadg(ojitshcjhn ojitshcjhnVar, CharSequence charSequence) {
                super(ojitshcjhnVar, charSequence);
            }

            @Override // xa.ojitshcjhn.zoijcleaow
            int eablkybsjg(int i13) {
                return i13 + 1;
            }

            @Override // xa.ojitshcjhn.zoijcleaow
            int gxszxtbevo(int i13) {
                return iobyxmoadg.this.f121859iobyxmoadg.ppxfxbqfkf(this.f121864jyumaefscl, i13);
            }
        }

        iobyxmoadg(xa.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f121859iobyxmoadg = ppxfxbqfkfVar;
        }

        @Override // xa.ojitshcjhn.ppxfxbqfkf
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public zoijcleaow iobyxmoadg(ojitshcjhn ojitshcjhnVar, CharSequence charSequence) {
            return new C3065iobyxmoadg(ojitshcjhnVar, charSequence);
        }
    }

    private interface ppxfxbqfkf {
        Iterator iobyxmoadg(ojitshcjhn ojitshcjhnVar, CharSequence charSequence);
    }

    private static abstract class zoijcleaow extends xa.iobyxmoadg {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final boolean f121861cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f121862esjtqupxsv = 0;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final xa.ppxfxbqfkf f121863iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final CharSequence f121864jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f121865lereixgezr;

        protected zoijcleaow(ojitshcjhn ojitshcjhnVar, CharSequence charSequence) {
            this.f121863iwizpuwonk = ojitshcjhnVar.f121855iobyxmoadg;
            this.f121861cqumvgiudr = ojitshcjhnVar.f121858zoijcleaow;
            this.f121865lereixgezr = ojitshcjhnVar.f121857wkgbmnqykc;
            this.f121864jyumaefscl = charSequence;
        }

        abstract int eablkybsjg(int i13);

        abstract int gxszxtbevo(int i13);

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // xa.iobyxmoadg
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public String iobyxmoadg() {
            int i13 = this.f121862esjtqupxsv;
            while (true) {
                int i14 = this.f121862esjtqupxsv;
                if (i14 == -1) {
                    return (String) zoijcleaow();
                }
                int iGxszxtbevo = gxszxtbevo(i14);
                if (iGxszxtbevo == -1) {
                    iGxszxtbevo = this.f121864jyumaefscl.length();
                    this.f121862esjtqupxsv = -1;
                } else {
                    this.f121862esjtqupxsv = eablkybsjg(iGxszxtbevo);
                }
                int i15 = this.f121862esjtqupxsv;
                if (i15 == i13) {
                    int i16 = i15 + 1;
                    this.f121862esjtqupxsv = i16;
                    if (i16 > this.f121864jyumaefscl.length()) {
                        this.f121862esjtqupxsv = -1;
                    }
                } else {
                    while (i13 < iGxszxtbevo && this.f121863iwizpuwonk.eablkybsjg(this.f121864jyumaefscl.charAt(i13))) {
                        i13++;
                    }
                    while (iGxszxtbevo > i13 && this.f121863iwizpuwonk.eablkybsjg(this.f121864jyumaefscl.charAt(iGxszxtbevo - 1))) {
                        iGxszxtbevo--;
                    }
                    if (!this.f121861cqumvgiudr || i13 != iGxszxtbevo) {
                        int i17 = this.f121865lereixgezr;
                        if (i17 == 1) {
                            iGxszxtbevo = this.f121864jyumaefscl.length();
                            this.f121862esjtqupxsv = -1;
                            while (iGxszxtbevo > i13 && this.f121863iwizpuwonk.eablkybsjg(this.f121864jyumaefscl.charAt(iGxszxtbevo - 1))) {
                                iGxszxtbevo--;
                            }
                        } else {
                            this.f121865lereixgezr = i17 - 1;
                        }
                        return this.f121864jyumaefscl.subSequence(i13, iGxszxtbevo).toString();
                    }
                    i13 = this.f121862esjtqupxsv;
                }
            }
        }
    }

    private ojitshcjhn(ppxfxbqfkf ppxfxbqfkfVar) {
        this(ppxfxbqfkfVar, false, xa.ppxfxbqfkf.gxszxtbevo(), Integer.MAX_VALUE);
    }

    public static ojitshcjhn eablkybsjg(xa.ppxfxbqfkf ppxfxbqfkfVar) {
        draadjrbmk.btonecajqb(ppxfxbqfkfVar);
        return new ojitshcjhn(new iobyxmoadg(ppxfxbqfkfVar));
    }

    private Iterator lqeggnwhkg(CharSequence charSequence) {
        return this.f121856ppxfxbqfkf.iobyxmoadg(this, charSequence);
    }

    public static ojitshcjhn wkgbmnqykc(char c13) {
        return eablkybsjg(xa.ppxfxbqfkf.wkgbmnqykc(c13));
    }

    public List gxszxtbevo(CharSequence charSequence) {
        draadjrbmk.btonecajqb(charSequence);
        Iterator itLqeggnwhkg = lqeggnwhkg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itLqeggnwhkg.hasNext()) {
            arrayList.add((String) itLqeggnwhkg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    private ojitshcjhn(ppxfxbqfkf ppxfxbqfkfVar, boolean z13, xa.ppxfxbqfkf ppxfxbqfkfVar2, int i13) {
        this.f121856ppxfxbqfkf = ppxfxbqfkfVar;
        this.f121858zoijcleaow = z13;
        this.f121855iobyxmoadg = ppxfxbqfkfVar2;
        this.f121857wkgbmnqykc = i13;
    }
}

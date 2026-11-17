package lk;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kcexrzcfyt extends istkbnxepw {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f63089ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f63090zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final zoijcleaow f63088wkgbmnqykc = new zoijcleaow(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final cqumvgiudr f63087eablkybsjg = cqumvgiudr.f62887eablkybsjg.iobyxmoadg("application/x-www-form-urlencoded");

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Charset f63091iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f63092ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f63093zoijcleaow;

        /* JADX WARN: Multi-variable type inference failed */
        public iobyxmoadg() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final iobyxmoadg iobyxmoadg(String name, String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            List list = this.f63093zoijcleaow;
            jyumaefscl.zoijcleaow zoijcleaowVar = jyumaefscl.f63067gtknphoqwx;
            list.add(jyumaefscl.zoijcleaow.zoijcleaow(zoijcleaowVar, name, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, this.f63091iobyxmoadg, 91, null));
            this.f63092ppxfxbqfkf.add(jyumaefscl.zoijcleaow.zoijcleaow(zoijcleaowVar, value, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, this.f63091iobyxmoadg, 91, null));
            return this;
        }

        public final kcexrzcfyt ppxfxbqfkf() {
            return new kcexrzcfyt(this.f63093zoijcleaow, this.f63092ppxfxbqfkf);
        }

        public final iobyxmoadg zoijcleaow(String name, String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            List list = this.f63093zoijcleaow;
            jyumaefscl.zoijcleaow zoijcleaowVar = jyumaefscl.f63067gtknphoqwx;
            list.add(jyumaefscl.zoijcleaow.zoijcleaow(zoijcleaowVar, name, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, this.f63091iobyxmoadg, 83, null));
            this.f63092ppxfxbqfkf.add(jyumaefscl.zoijcleaow.zoijcleaow(zoijcleaowVar, value, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, this.f63091iobyxmoadg, 83, null));
            return this;
        }

        public iobyxmoadg(Charset charset) {
            this.f63091iobyxmoadg = charset;
            this.f63093zoijcleaow = new ArrayList();
            this.f63092ppxfxbqfkf = new ArrayList();
        }

        public /* synthetic */ iobyxmoadg(Charset charset, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? null : charset);
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    public kcexrzcfyt(List encodedNames, List encodedValues) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encodedNames, "encodedNames");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encodedValues, "encodedValues");
        this.f63090zoijcleaow = mk.rgvfuqvkyq.yggfygwlhe(encodedNames);
        this.f63089ppxfxbqfkf = mk.rgvfuqvkyq.yggfygwlhe(encodedValues);
    }

    private final long btonecajqb(bl.wkgbmnqykc wkgbmnqykcVar, boolean z13) throws EOFException {
        bl.ppxfxbqfkf ppxfxbqfkfVarZoijcleaow;
        if (z13) {
            ppxfxbqfkfVarZoijcleaow = new bl.ppxfxbqfkf();
        } else {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(wkgbmnqykcVar);
            ppxfxbqfkfVarZoijcleaow = wkgbmnqykcVar.zoijcleaow();
        }
        int size = this.f63090zoijcleaow.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (i13 > 0) {
                ppxfxbqfkfVarZoijcleaow.o(38);
            }
            ppxfxbqfkfVarZoijcleaow.metgxyhuhe((String) this.f63090zoijcleaow.get(i13));
            ppxfxbqfkfVarZoijcleaow.o(61);
            ppxfxbqfkfVarZoijcleaow.metgxyhuhe((String) this.f63089ppxfxbqfkf.get(i13));
        }
        if (!z13) {
            return 0L;
        }
        long jDsvhmnatus = ppxfxbqfkfVarZoijcleaow.dsvhmnatus();
        ppxfxbqfkfVarZoijcleaow.iobyxmoadg();
        return jDsvhmnatus;
    }

    @Override // lk.istkbnxepw
    public void dxjokdxxww(bl.wkgbmnqykc sink) throws EOFException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sink, "sink");
        btonecajqb(sink, false);
    }

    @Override // lk.istkbnxepw
    public long iobyxmoadg() {
        return btonecajqb(null, true);
    }

    @Override // lk.istkbnxepw
    public cqumvgiudr zoijcleaow() {
        return f63087eablkybsjg;
    }
}

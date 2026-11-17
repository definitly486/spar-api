package di;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.DescriptorProtos;
import io.appmetrica.analytics.impl.C4007z9;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes3.dex */
public final class oxmwwwfdhm extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.wkgbmnqykc implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq f28709pkzmftpjix = new iobyxmoadg();

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private static final oxmwwwfdhm f28710ylkuphrtab;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f28711cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f28712cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f28713esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private List f28714iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private vdvldrhtss f28715istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f28716iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc f28717jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private List f28718lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private byte f28719lmojexxdyd;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private vdvldrhtss f28720pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private int f28721wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private List f28722yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f28723zynmafqrjb;

    static class iobyxmoadg extends kotlin.reflect.jvm.internal.impl.protobuf.zoijcleaow {
        iobyxmoadg() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq
        /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
        public oxmwwwfdhm zoijcleaow(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
            return new oxmwwwfdhm(eablkybsjgVar, gxszxtbevoVar);
        }
    }

    public static final class zoijcleaow extends kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.ppxfxbqfkf implements kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn {

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        private int f28724cdpycssgdh;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private int f28726esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private int f28729iwizpuwonk;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private int f28733zynmafqrjb;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private int f28725cqumvgiudr = 6;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private List f28730lereixgezr = Collections.emptyList();

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private vdvldrhtss f28731pmvmpeiblj = vdvldrhtss.ikoacuggdj();

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        private vdvldrhtss f28728istkbnxepw = vdvldrhtss.ikoacuggdj();

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        private List f28732yadqdtsiqt = Collections.emptyList();

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        private List f28727iozdgvuglv = Collections.emptyList();

        private zoijcleaow() {
            zdlpuopuiu();
        }

        private void kcexrzcfyt() {
            if ((this.f28729iwizpuwonk & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 256) {
                this.f28727iozdgvuglv = new ArrayList(this.f28727iozdgvuglv);
                this.f28729iwizpuwonk |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
            }
        }

        private void oxmwwwfdhm() {
            if ((this.f28729iwizpuwonk & 4) != 4) {
                this.f28730lereixgezr = new ArrayList(this.f28730lereixgezr);
                this.f28729iwizpuwonk |= 4;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static zoijcleaow rgvfuqvkyq() {
            return new zoijcleaow();
        }

        private void vdvldrhtss() {
            if ((this.f28729iwizpuwonk & UserVerificationMethods.USER_VERIFY_PATTERN) != 128) {
                this.f28732yadqdtsiqt = new ArrayList(this.f28732yadqdtsiqt);
                this.f28729iwizpuwonk |= UserVerificationMethods.USER_VERIFY_PATTERN;
            }
        }

        private void zdlpuopuiu() {
        }

        public oxmwwwfdhm agtfadlqog() {
            oxmwwwfdhm oxmwwwfdhmVar = new oxmwwwfdhm(this);
            int i13 = this.f28729iwizpuwonk;
            int i14 = (i13 & 1) != 1 ? 0 : 1;
            oxmwwwfdhmVar.f28712cqumvgiudr = this.f28725cqumvgiudr;
            if ((i13 & 2) == 2) {
                i14 |= 2;
            }
            oxmwwwfdhmVar.f28713esjtqupxsv = this.f28726esjtqupxsv;
            if ((this.f28729iwizpuwonk & 4) == 4) {
                this.f28730lereixgezr = Collections.unmodifiableList(this.f28730lereixgezr);
                this.f28729iwizpuwonk &= -5;
            }
            oxmwwwfdhmVar.f28718lereixgezr = this.f28730lereixgezr;
            if ((i13 & 8) == 8) {
                i14 |= 4;
            }
            oxmwwwfdhmVar.f28720pmvmpeiblj = this.f28731pmvmpeiblj;
            if ((i13 & 16) == 16) {
                i14 |= 8;
            }
            oxmwwwfdhmVar.f28723zynmafqrjb = this.f28733zynmafqrjb;
            if ((i13 & 32) == 32) {
                i14 |= 16;
            }
            oxmwwwfdhmVar.f28715istkbnxepw = this.f28728istkbnxepw;
            if ((i13 & 64) == 64) {
                i14 |= 32;
            }
            oxmwwwfdhmVar.f28711cdpycssgdh = this.f28724cdpycssgdh;
            if ((this.f28729iwizpuwonk & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                this.f28732yadqdtsiqt = Collections.unmodifiableList(this.f28732yadqdtsiqt);
                this.f28729iwizpuwonk &= -129;
            }
            oxmwwwfdhmVar.f28722yadqdtsiqt = this.f28732yadqdtsiqt;
            if ((this.f28729iwizpuwonk & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
                this.f28727iozdgvuglv = Collections.unmodifiableList(this.f28727iozdgvuglv);
                this.f28729iwizpuwonk &= -257;
            }
            oxmwwwfdhmVar.f28714iozdgvuglv = this.f28727iozdgvuglv;
            oxmwwwfdhmVar.f28716iwizpuwonk = i14;
            return oxmwwwfdhmVar;
        }

        public zoijcleaow cqumvgiudr(vdvldrhtss vdvldrhtssVar) {
            if ((this.f28729iwizpuwonk & 8) != 8 || this.f28731pmvmpeiblj == vdvldrhtss.ikoacuggdj()) {
                this.f28731pmvmpeiblj = vdvldrhtssVar;
            } else {
                this.f28731pmvmpeiblj = vdvldrhtss.igdgnonuha(this.f28731pmvmpeiblj).wkgbmnqykc(vdvldrhtssVar).agtfadlqog();
            }
            this.f28729iwizpuwonk |= 8;
            return this;
        }

        public zoijcleaow esjtqupxsv(int i13) {
            this.f28729iwizpuwonk |= 64;
            this.f28724cdpycssgdh = i13;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: iwizpuwonk, reason: merged with bridge method [inline-methods] */
        public zoijcleaow kegysxyocb(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) throws Throwable {
            oxmwwwfdhm oxmwwwfdhmVar = null;
            try {
                try {
                    oxmwwwfdhm oxmwwwfdhmVar2 = (oxmwwwfdhm) oxmwwwfdhm.f28709pkzmftpjix.zoijcleaow(eablkybsjgVar, gxszxtbevoVar);
                    if (oxmwwwfdhmVar2 != null) {
                        wkgbmnqykc(oxmwwwfdhmVar2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e13) {
                    oxmwwwfdhm oxmwwwfdhmVar3 = (oxmwwwfdhm) e13.iobyxmoadg();
                    try {
                        throw e13;
                    } catch (Throwable th2) {
                        th = th2;
                        oxmwwwfdhmVar = oxmwwwfdhmVar3;
                        if (oxmwwwfdhmVar != null) {
                            wkgbmnqykc(oxmwwwfdhmVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (oxmwwwfdhmVar != null) {
                    wkgbmnqykc(oxmwwwfdhmVar);
                }
                throw th;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.zoijcleaow
        /* JADX INFO: renamed from: jyumaefscl, reason: merged with bridge method [inline-methods] */
        public zoijcleaow wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            if (oxmwwwfdhmVar == oxmwwwfdhm.sopmlzcsov()) {
                return this;
            }
            if (oxmwwwfdhmVar.yfnezrywwk()) {
                lereixgezr(oxmwwwfdhmVar.vipkmwdibw());
            }
            if (oxmwwwfdhmVar.ydmasvzmpa()) {
                pmvmpeiblj(oxmwwwfdhmVar.jhduphickx());
            }
            if (!oxmwwwfdhmVar.f28718lereixgezr.isEmpty()) {
                if (this.f28730lereixgezr.isEmpty()) {
                    this.f28730lereixgezr = oxmwwwfdhmVar.f28718lereixgezr;
                    this.f28729iwizpuwonk &= -5;
                } else {
                    oxmwwwfdhm();
                    this.f28730lereixgezr.addAll(oxmwwwfdhmVar.f28718lereixgezr);
                }
            }
            if (oxmwwwfdhmVar.sflfametgt()) {
                cqumvgiudr(oxmwwwfdhmVar.xrmfcynszj());
            }
            if (oxmwwwfdhmVar.zfvoamnweg()) {
                zynmafqrjb(oxmwwwfdhmVar.metgxyhuhe());
            }
            if (oxmwwwfdhmVar.czzsidtyhn()) {
                yggfygwlhe(oxmwwwfdhmVar.jlmebxxoox());
            }
            if (oxmwwwfdhmVar.uwvvkdfqfp()) {
                esjtqupxsv(oxmwwwfdhmVar.ribwqtqdhb());
            }
            if (!oxmwwwfdhmVar.f28722yadqdtsiqt.isEmpty()) {
                if (this.f28732yadqdtsiqt.isEmpty()) {
                    this.f28732yadqdtsiqt = oxmwwwfdhmVar.f28722yadqdtsiqt;
                    this.f28729iwizpuwonk &= -129;
                } else {
                    vdvldrhtss();
                    this.f28732yadqdtsiqt.addAll(oxmwwwfdhmVar.f28722yadqdtsiqt);
                }
            }
            if (!oxmwwwfdhmVar.f28714iozdgvuglv.isEmpty()) {
                if (this.f28727iozdgvuglv.isEmpty()) {
                    this.f28727iozdgvuglv = oxmwwwfdhmVar.f28714iozdgvuglv;
                    this.f28729iwizpuwonk &= -257;
                } else {
                    kcexrzcfyt();
                    this.f28727iozdgvuglv.addAll(oxmwwwfdhmVar.f28714iozdgvuglv);
                }
            }
            gtknphoqwx(oxmwwwfdhmVar);
            eablkybsjg(ppxfxbqfkf().zoijcleaow(oxmwwwfdhmVar.f28717jyumaefscl));
            return this;
        }

        public zoijcleaow lereixgezr(int i13) {
            this.f28729iwizpuwonk |= 1;
            this.f28725cqumvgiudr = i13;
            return this;
        }

        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public zoijcleaow clone() {
            return rgvfuqvkyq().wkgbmnqykc(agtfadlqog());
        }

        public zoijcleaow pmvmpeiblj(int i13) {
            this.f28729iwizpuwonk |= 2;
            this.f28726esjtqupxsv = i13;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog.iobyxmoadg
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public oxmwwwfdhm build() {
            oxmwwwfdhm oxmwwwfdhmVarAgtfadlqog = agtfadlqog();
            if (oxmwwwfdhmVarAgtfadlqog.isInitialized()) {
                return oxmwwwfdhmVarAgtfadlqog;
            }
            throw kotlin.reflect.jvm.internal.impl.protobuf.iobyxmoadg.AbstractC1196iobyxmoadg.zoijcleaow(oxmwwwfdhmVarAgtfadlqog);
        }

        public zoijcleaow yggfygwlhe(vdvldrhtss vdvldrhtssVar) {
            if ((this.f28729iwizpuwonk & 32) != 32 || this.f28728istkbnxepw == vdvldrhtss.ikoacuggdj()) {
                this.f28728istkbnxepw = vdvldrhtssVar;
            } else {
                this.f28728istkbnxepw = vdvldrhtss.igdgnonuha(this.f28728istkbnxepw).wkgbmnqykc(vdvldrhtssVar).agtfadlqog();
            }
            this.f28729iwizpuwonk |= 32;
            return this;
        }

        public zoijcleaow zynmafqrjb(int i13) {
            this.f28729iwizpuwonk |= 16;
            this.f28733zynmafqrjb = i13;
            return this;
        }
    }

    static {
        oxmwwwfdhm oxmwwwfdhmVar = new oxmwwwfdhm(true);
        f28710ylkuphrtab = oxmwwwfdhmVar;
        oxmwwwfdhmVar.oipsdeybqn();
    }

    public static zoijcleaow bfopjjpdmp() {
        return zoijcleaow.rgvfuqvkyq();
    }

    private void oipsdeybqn() {
        this.f28712cqumvgiudr = 6;
        this.f28713esjtqupxsv = 0;
        this.f28718lereixgezr = Collections.emptyList();
        this.f28720pmvmpeiblj = vdvldrhtss.ikoacuggdj();
        this.f28723zynmafqrjb = 0;
        this.f28715istkbnxepw = vdvldrhtss.ikoacuggdj();
        this.f28711cdpycssgdh = 0;
        this.f28722yadqdtsiqt = Collections.emptyList();
        this.f28714iozdgvuglv = Collections.emptyList();
    }

    public static zoijcleaow opjhrmiecq(oxmwwwfdhm oxmwwwfdhmVar) {
        return bfopjjpdmp().wkgbmnqykc(oxmwwwfdhmVar);
    }

    public static oxmwwwfdhm sopmlzcsov() {
        return f28710ylkuphrtab;
    }

    public static oxmwwwfdhm weqkydbzbr(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
        return (oxmwwwfdhm) f28709pkzmftpjix.ppxfxbqfkf(inputStream, gxszxtbevoVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn
    /* JADX INFO: renamed from: crxdokpmqz, reason: merged with bridge method [inline-methods] */
    public oxmwwwfdhm getDefaultInstanceForType() {
        return f28710ylkuphrtab;
    }

    public boolean czzsidtyhn() {
        return (this.f28716iwizpuwonk & 16) == 16;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public int getSerializedSize() {
        int i13 = this.f28721wwaezpbzkn;
        if (i13 != -1) {
            return i13;
        }
        int iOjitshcjhn = (this.f28716iwizpuwonk & 1) == 1 ? CodedOutputStream.ojitshcjhn(1, this.f28712cqumvgiudr) : 0;
        if ((this.f28716iwizpuwonk & 2) == 2) {
            iOjitshcjhn += CodedOutputStream.ojitshcjhn(2, this.f28713esjtqupxsv);
        }
        for (int i14 = 0; i14 < this.f28718lereixgezr.size(); i14++) {
            iOjitshcjhn += CodedOutputStream.oxmwwwfdhm(3, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28718lereixgezr.get(i14));
        }
        if ((this.f28716iwizpuwonk & 4) == 4) {
            iOjitshcjhn += CodedOutputStream.oxmwwwfdhm(4, this.f28720pmvmpeiblj);
        }
        if ((this.f28716iwizpuwonk & 8) == 8) {
            iOjitshcjhn += CodedOutputStream.ojitshcjhn(5, this.f28723zynmafqrjb);
        }
        if ((this.f28716iwizpuwonk & 16) == 16) {
            iOjitshcjhn += CodedOutputStream.oxmwwwfdhm(6, this.f28715istkbnxepw);
        }
        if ((this.f28716iwizpuwonk & 32) == 32) {
            iOjitshcjhn += CodedOutputStream.ojitshcjhn(7, this.f28711cdpycssgdh);
        }
        for (int i15 = 0; i15 < this.f28722yadqdtsiqt.size(); i15++) {
            iOjitshcjhn += CodedOutputStream.oxmwwwfdhm(8, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28722yadqdtsiqt.get(i15));
        }
        int iRgvfuqvkyq = 0;
        for (int i16 = 0; i16 < this.f28714iozdgvuglv.size(); i16++) {
            iRgvfuqvkyq += CodedOutputStream.rgvfuqvkyq(((Integer) this.f28714iozdgvuglv.get(i16)).intValue());
        }
        int size = iOjitshcjhn + iRgvfuqvkyq + (rlfsiqarku().size() * 2) + yggfygwlhe() + this.f28717jyumaefscl.size();
        this.f28721wwaezpbzkn = size;
        return size;
    }

    public kcexrzcfyt ikoacuggdj(int i13) {
        return (kcexrzcfyt) this.f28718lereixgezr.get(i13);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    public void iobyxmoadg(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.wkgbmnqykc.iobyxmoadg iobyxmoadgVarZynmafqrjb = zynmafqrjb();
        if ((this.f28716iwizpuwonk & 1) == 1) {
            codedOutputStream.ribwqtqdhb(1, this.f28712cqumvgiudr);
        }
        if ((this.f28716iwizpuwonk & 2) == 2) {
            codedOutputStream.ribwqtqdhb(2, this.f28713esjtqupxsv);
        }
        for (int i13 = 0; i13 < this.f28718lereixgezr.size(); i13++) {
            codedOutputStream.ikoacuggdj(3, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28718lereixgezr.get(i13));
        }
        if ((this.f28716iwizpuwonk & 4) == 4) {
            codedOutputStream.ikoacuggdj(4, this.f28720pmvmpeiblj);
        }
        if ((this.f28716iwizpuwonk & 8) == 8) {
            codedOutputStream.ribwqtqdhb(5, this.f28723zynmafqrjb);
        }
        if ((this.f28716iwizpuwonk & 16) == 16) {
            codedOutputStream.ikoacuggdj(6, this.f28715istkbnxepw);
        }
        if ((this.f28716iwizpuwonk & 32) == 32) {
            codedOutputStream.ribwqtqdhb(7, this.f28711cdpycssgdh);
        }
        for (int i14 = 0; i14 < this.f28722yadqdtsiqt.size(); i14++) {
            codedOutputStream.ikoacuggdj(8, (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f28722yadqdtsiqt.get(i14));
        }
        for (int i15 = 0; i15 < this.f28714iozdgvuglv.size(); i15++) {
            codedOutputStream.ribwqtqdhb(31, ((Integer) this.f28714iozdgvuglv.get(i15)).intValue());
        }
        iobyxmoadgVarZynmafqrjb.iobyxmoadg(200, codedOutputStream);
        codedOutputStream.rlfsiqarku(this.f28717jyumaefscl);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ojitshcjhn
    public final boolean isInitialized() {
        byte b13 = this.f28719lmojexxdyd;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        if (!ydmasvzmpa()) {
            this.f28719lmojexxdyd = (byte) 0;
            return false;
        }
        for (int i13 = 0; i13 < okpsazkaxt(); i13++) {
            if (!ikoacuggdj(i13).isInitialized()) {
                this.f28719lmojexxdyd = (byte) 0;
                return false;
            }
        }
        if (sflfametgt() && !xrmfcynszj().isInitialized()) {
            this.f28719lmojexxdyd = (byte) 0;
            return false;
        }
        if (czzsidtyhn() && !jlmebxxoox().isInitialized()) {
            this.f28719lmojexxdyd = (byte) 0;
            return false;
        }
        for (int i14 = 0; i14 < ntlheqmsrt(); i14++) {
            if (!mbcevpiqjq(i14).isInitialized()) {
                this.f28719lmojexxdyd = (byte) 0;
                return false;
            }
        }
        if (zdlpuopuiu()) {
            this.f28719lmojexxdyd = (byte) 1;
            return true;
        }
        this.f28719lmojexxdyd = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: iyctptxqzt, reason: merged with bridge method [inline-methods] */
    public zoijcleaow newBuilderForType() {
        return bfopjjpdmp();
    }

    public int jhduphickx() {
        return this.f28713esjtqupxsv;
    }

    public vdvldrhtss jlmebxxoox() {
        return this.f28715istkbnxepw;
    }

    public List jztzpxfvev() {
        return this.f28718lereixgezr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog
    /* JADX INFO: renamed from: lrnfpwlwnk, reason: merged with bridge method [inline-methods] */
    public zoijcleaow toBuilder() {
        return opjhrmiecq(this);
    }

    public di.zoijcleaow mbcevpiqjq(int i13) {
        return (di.zoijcleaow) this.f28722yadqdtsiqt.get(i13);
    }

    public int metgxyhuhe() {
        return this.f28723zynmafqrjb;
    }

    public int ntlheqmsrt() {
        return this.f28722yadqdtsiqt.size();
    }

    public int okpsazkaxt() {
        return this.f28718lereixgezr.size();
    }

    public int ribwqtqdhb() {
        return this.f28711cdpycssgdh;
    }

    public List rlfsiqarku() {
        return this.f28714iozdgvuglv;
    }

    public boolean sflfametgt() {
        return (this.f28716iwizpuwonk & 4) == 4;
    }

    public List ulzqkzuiru() {
        return this.f28722yadqdtsiqt;
    }

    public boolean uwvvkdfqfp() {
        return (this.f28716iwizpuwonk & 32) == 32;
    }

    public int vipkmwdibw() {
        return this.f28712cqumvgiudr;
    }

    public vdvldrhtss xrmfcynszj() {
        return this.f28720pmvmpeiblj;
    }

    public boolean ydmasvzmpa() {
        return (this.f28716iwizpuwonk & 2) == 2;
    }

    public boolean yfnezrywwk() {
        return (this.f28716iwizpuwonk & 1) == 1;
    }

    public boolean zfvoamnweg() {
        return (this.f28716iwizpuwonk & 8) == 8;
    }

    private oxmwwwfdhm(kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.ppxfxbqfkf ppxfxbqfkfVar) {
        super(ppxfxbqfkfVar);
        this.f28719lmojexxdyd = (byte) -1;
        this.f28721wwaezpbzkn = -1;
        this.f28717jyumaefscl = ppxfxbqfkfVar.ppxfxbqfkf();
    }

    private oxmwwwfdhm(boolean z13) {
        this.f28719lmojexxdyd = (byte) -1;
        this.f28721wwaezpbzkn = -1;
        this.f28717jyumaefscl = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.f60173zdlpuopuiu;
    }

    private oxmwwwfdhm(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar) {
        vdvldrhtss.ppxfxbqfkf builder;
        this.f28719lmojexxdyd = (byte) -1;
        this.f28721wwaezpbzkn = -1;
        oipsdeybqn();
        kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.zoijcleaow zoijcleaowVarAgtfadlqog = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.agtfadlqog();
        CodedOutputStream codedOutputStreamYlkuphrtab = CodedOutputStream.ylkuphrtab(zoijcleaowVarAgtfadlqog, 1);
        boolean z13 = false;
        int i13 = 0;
        while (!z13) {
            try {
                try {
                    int iPkzmftpjix = eablkybsjgVar.pkzmftpjix();
                    switch (iPkzmftpjix) {
                        case 0:
                            break;
                        case 8:
                            this.f28716iwizpuwonk |= 1;
                            this.f28712cqumvgiudr = eablkybsjgVar.oxmwwwfdhm();
                            continue;
                        case 16:
                            this.f28716iwizpuwonk |= 2;
                            this.f28713esjtqupxsv = eablkybsjgVar.oxmwwwfdhm();
                            continue;
                        case C4007z9.G /* 26 */:
                            if ((i13 & 4) != 4) {
                                this.f28718lereixgezr = new ArrayList();
                                i13 |= 4;
                            }
                            this.f28718lereixgezr.add(eablkybsjgVar.zdlpuopuiu(kcexrzcfyt.f28621wwaezpbzkn, gxszxtbevoVar));
                            continue;
                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                            builder = (this.f28716iwizpuwonk & 4) == 4 ? this.f28720pmvmpeiblj.toBuilder() : null;
                            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) eablkybsjgVar.zdlpuopuiu(vdvldrhtss.f28814dsvhmnatus, gxszxtbevoVar);
                            this.f28720pmvmpeiblj = vdvldrhtssVar;
                            if (builder != null) {
                                builder.wkgbmnqykc(vdvldrhtssVar);
                                this.f28720pmvmpeiblj = builder.agtfadlqog();
                            }
                            this.f28716iwizpuwonk |= 4;
                            continue;
                        case 40:
                            this.f28716iwizpuwonk |= 8;
                            this.f28723zynmafqrjb = eablkybsjgVar.oxmwwwfdhm();
                            continue;
                        case 50:
                            builder = (this.f28716iwizpuwonk & 16) == 16 ? this.f28715istkbnxepw.toBuilder() : null;
                            vdvldrhtss vdvldrhtssVar2 = (vdvldrhtss) eablkybsjgVar.zdlpuopuiu(vdvldrhtss.f28814dsvhmnatus, gxszxtbevoVar);
                            this.f28715istkbnxepw = vdvldrhtssVar2;
                            if (builder != null) {
                                builder.wkgbmnqykc(vdvldrhtssVar2);
                                this.f28715istkbnxepw = builder.agtfadlqog();
                            }
                            this.f28716iwizpuwonk |= 16;
                            continue;
                        case 56:
                            this.f28716iwizpuwonk |= 32;
                            this.f28711cdpycssgdh = eablkybsjgVar.oxmwwwfdhm();
                            continue;
                        case 66:
                            if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 128) {
                                this.f28722yadqdtsiqt = new ArrayList();
                                i13 |= UserVerificationMethods.USER_VERIFY_PATTERN;
                            }
                            this.f28722yadqdtsiqt.add(eablkybsjgVar.zdlpuopuiu(di.zoijcleaow.f28927zynmafqrjb, gxszxtbevoVar));
                            continue;
                        case 248:
                            if ((i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 256) {
                                this.f28714iozdgvuglv = new ArrayList();
                                i13 |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                            }
                            this.f28714iozdgvuglv.add(Integer.valueOf(eablkybsjgVar.oxmwwwfdhm()));
                            continue;
                        case 250:
                            int iDxjokdxxww = eablkybsjgVar.dxjokdxxww(eablkybsjgVar.lereixgezr());
                            if ((i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 256 && eablkybsjgVar.eablkybsjg() > 0) {
                                this.f28714iozdgvuglv = new ArrayList();
                                i13 |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                            }
                            while (eablkybsjgVar.eablkybsjg() > 0) {
                                this.f28714iozdgvuglv.add(Integer.valueOf(eablkybsjgVar.oxmwwwfdhm()));
                            }
                            eablkybsjgVar.nufgyqmvbu(iDxjokdxxww);
                            continue;
                        default:
                            if (!rgvfuqvkyq(eablkybsjgVar, codedOutputStreamYlkuphrtab, gxszxtbevoVar, iPkzmftpjix)) {
                                break;
                            }
                            break;
                    }
                    z13 = true;
                } catch (Throwable th2) {
                    if ((i13 & 4) == 4) {
                        this.f28718lereixgezr = Collections.unmodifiableList(this.f28718lereixgezr);
                    }
                    if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                        this.f28722yadqdtsiqt = Collections.unmodifiableList(this.f28722yadqdtsiqt);
                    }
                    if ((i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
                        this.f28714iozdgvuglv = Collections.unmodifiableList(this.f28714iozdgvuglv);
                    }
                    try {
                        codedOutputStreamYlkuphrtab.wwaezpbzkn();
                    } catch (IOException unused) {
                    } finally {
                        this.f28717jyumaefscl = zoijcleaowVarAgtfadlqog.dxjokdxxww();
                    }
                    draadjrbmk();
                    throw th2;
                }
            } catch (InvalidProtocolBufferException e13) {
                throw e13.ojitshcjhn(this);
            } catch (IOException e14) {
                throw new InvalidProtocolBufferException(e14.getMessage()).ojitshcjhn(this);
            }
        }
        if ((i13 & 4) == 4) {
            this.f28718lereixgezr = Collections.unmodifiableList(this.f28718lereixgezr);
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
            this.f28722yadqdtsiqt = Collections.unmodifiableList(this.f28722yadqdtsiqt);
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
            this.f28714iozdgvuglv = Collections.unmodifiableList(this.f28714iozdgvuglv);
        }
        try {
            codedOutputStreamYlkuphrtab.wwaezpbzkn();
        } catch (IOException unused2) {
        } finally {
            this.f28717jyumaefscl = zoijcleaowVarAgtfadlqog.dxjokdxxww();
        }
        draadjrbmk();
    }
}

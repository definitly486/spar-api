package hm;

import cm.vdvldrhtss;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class eablkybsjg implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final int f40763cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final zoijcleaow f40764esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final cm.lqeggnwhkg f40765iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final cm.zoijcleaow f40766jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final vdvldrhtss f40767lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final vdvldrhtss f40768pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final byte f40769yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final cm.nufgyqmvbu f40770zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final vdvldrhtss f40771zynmafqrjb;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f40772iobyxmoadg;

        static {
            int[] iArr = new int[zoijcleaow.values().length];
            f40772iobyxmoadg = iArr;
            try {
                iArr[zoijcleaow.UTC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40772iobyxmoadg[zoijcleaow.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum zoijcleaow {
        UTC,
        WALL,
        STANDARD;

        public cm.gxszxtbevo iobyxmoadg(cm.gxszxtbevo gxszxtbevoVar, vdvldrhtss vdvldrhtssVar, vdvldrhtss vdvldrhtssVar2) {
            int i13 = iobyxmoadg.f40772iobyxmoadg[ordinal()];
            if (i13 != 1) {
                return i13 != 2 ? gxszxtbevoVar : gxszxtbevoVar.sopmlzcsov(vdvldrhtssVar2.lmojexxdyd() - vdvldrhtssVar.lmojexxdyd());
            }
            return gxszxtbevoVar.sopmlzcsov(vdvldrhtssVar2.lmojexxdyd() - vdvldrhtss.f20155pmvmpeiblj.lmojexxdyd());
        }
    }

    eablkybsjg(cm.nufgyqmvbu nufgyqmvbuVar, int i13, cm.zoijcleaow zoijcleaowVar, cm.lqeggnwhkg lqeggnwhkgVar, int i14, zoijcleaow zoijcleaowVar2, vdvldrhtss vdvldrhtssVar, vdvldrhtss vdvldrhtssVar2, vdvldrhtss vdvldrhtssVar3) {
        this.f40770zdlpuopuiu = nufgyqmvbuVar;
        this.f40769yggfygwlhe = (byte) i13;
        this.f40766jyumaefscl = zoijcleaowVar;
        this.f40765iwizpuwonk = lqeggnwhkgVar;
        this.f40763cqumvgiudr = i14;
        this.f40764esjtqupxsv = zoijcleaowVar2;
        this.f40767lereixgezr = vdvldrhtssVar;
        this.f40768pmvmpeiblj = vdvldrhtssVar2;
        this.f40771zynmafqrjb = vdvldrhtssVar3;
    }

    private void iobyxmoadg(StringBuilder sb3, long j13) {
        if (j13 < 10) {
            sb3.append(0);
        }
        sb3.append(j13);
    }

    static eablkybsjg lqeggnwhkg(DataInput dataInput) throws IOException {
        int i13 = dataInput.readInt();
        cm.nufgyqmvbu nufgyqmvbuVarPmvmpeiblj = cm.nufgyqmvbu.pmvmpeiblj(i13 >>> 28);
        int i14 = ((264241152 & i13) >>> 22) - 32;
        int i15 = (3670016 & i13) >>> 19;
        cm.zoijcleaow zoijcleaowVarZdlpuopuiu = i15 == 0 ? null : cm.zoijcleaow.zdlpuopuiu(i15);
        int i16 = (507904 & i13) >>> 14;
        zoijcleaow zoijcleaowVar = zoijcleaow.values()[(i13 & 12288) >>> 12];
        int i17 = (i13 & 4080) >>> 4;
        int i18 = (i13 & 12) >>> 2;
        int i19 = i13 & 3;
        int i23 = i16 == 31 ? dataInput.readInt() : i16 * 3600;
        vdvldrhtss vdvldrhtssVarPkzmftpjix = vdvldrhtss.pkzmftpjix(i17 == 255 ? dataInput.readInt() : (i17 - 128) * 900);
        vdvldrhtss vdvldrhtssVarPkzmftpjix2 = vdvldrhtss.pkzmftpjix(i18 == 3 ? dataInput.readInt() : vdvldrhtssVarPkzmftpjix.lmojexxdyd() + (i18 * 1800));
        vdvldrhtss vdvldrhtssVarPkzmftpjix3 = vdvldrhtss.pkzmftpjix(i19 == 3 ? dataInput.readInt() : vdvldrhtssVarPkzmftpjix.lmojexxdyd() + (i19 * 1800));
        if (i14 < -28 || i14 > 31 || i14 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        return new eablkybsjg(nufgyqmvbuVarPmvmpeiblj, i14, zoijcleaowVarZdlpuopuiu, cm.lqeggnwhkg.lmojexxdyd(fm.ppxfxbqfkf.gxszxtbevo(i23, 86400)), fm.ppxfxbqfkf.wkgbmnqykc(i23, 86400), zoijcleaowVar, vdvldrhtssVarPkzmftpjix, vdvldrhtssVarPkzmftpjix2, vdvldrhtssVarPkzmftpjix3);
    }

    private Object writeReplace() {
        return new hm.iobyxmoadg((byte) 3, this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return this.f40770zdlpuopuiu == eablkybsjgVar.f40770zdlpuopuiu && this.f40769yggfygwlhe == eablkybsjgVar.f40769yggfygwlhe && this.f40766jyumaefscl == eablkybsjgVar.f40766jyumaefscl && this.f40764esjtqupxsv == eablkybsjgVar.f40764esjtqupxsv && this.f40763cqumvgiudr == eablkybsjgVar.f40763cqumvgiudr && this.f40765iwizpuwonk.equals(eablkybsjgVar.f40765iwizpuwonk) && this.f40767lereixgezr.equals(eablkybsjgVar.f40767lereixgezr) && this.f40768pmvmpeiblj.equals(eablkybsjgVar.f40768pmvmpeiblj) && this.f40771zynmafqrjb.equals(eablkybsjgVar.f40771zynmafqrjb);
    }

    public int hashCode() {
        int iWypolnanlu = ((this.f40765iwizpuwonk.wypolnanlu() + this.f40763cqumvgiudr) << 15) + (this.f40770zdlpuopuiu.ordinal() << 11) + ((this.f40769yggfygwlhe + 32) << 5);
        cm.zoijcleaow zoijcleaowVar = this.f40766jyumaefscl;
        return ((((iWypolnanlu + ((zoijcleaowVar == null ? 7 : zoijcleaowVar.ordinal()) << 2)) + this.f40764esjtqupxsv.ordinal()) ^ this.f40767lereixgezr.hashCode()) ^ this.f40768pmvmpeiblj.hashCode()) ^ this.f40771zynmafqrjb.hashCode();
    }

    void nufgyqmvbu(DataOutput dataOutput) throws IOException {
        int iLereixgezr;
        int iWypolnanlu = this.f40765iwizpuwonk.wypolnanlu() + (this.f40763cqumvgiudr * 86400);
        int iLmojexxdyd = this.f40767lereixgezr.lmojexxdyd();
        int iLmojexxdyd2 = this.f40768pmvmpeiblj.lmojexxdyd() - iLmojexxdyd;
        int iLmojexxdyd3 = this.f40771zynmafqrjb.lmojexxdyd() - iLmojexxdyd;
        if (iWypolnanlu % 3600 != 0 || iWypolnanlu > 86400) {
            iLereixgezr = 31;
        } else {
            iLereixgezr = iWypolnanlu == 86400 ? 24 : this.f40765iwizpuwonk.lereixgezr();
        }
        int i13 = iLmojexxdyd % 900 == 0 ? (iLmojexxdyd / 900) + UserVerificationMethods.USER_VERIFY_PATTERN : 255;
        int i14 = (iLmojexxdyd2 == 0 || iLmojexxdyd2 == 1800 || iLmojexxdyd2 == 3600) ? iLmojexxdyd2 / 1800 : 3;
        int i15 = (iLmojexxdyd3 == 0 || iLmojexxdyd3 == 1800 || iLmojexxdyd3 == 3600) ? iLmojexxdyd3 / 1800 : 3;
        cm.zoijcleaow zoijcleaowVar = this.f40766jyumaefscl;
        dataOutput.writeInt((this.f40770zdlpuopuiu.zdlpuopuiu() << 28) + ((this.f40769yggfygwlhe + 32) << 22) + ((zoijcleaowVar == null ? 0 : zoijcleaowVar.kcexrzcfyt()) << 19) + (iLereixgezr << 14) + (this.f40764esjtqupxsv.ordinal() << 12) + (i13 << 4) + (i14 << 2) + i15);
        if (iLereixgezr == 31) {
            dataOutput.writeInt(iWypolnanlu);
        }
        if (i13 == 255) {
            dataOutput.writeInt(iLmojexxdyd);
        }
        if (i14 == 3) {
            dataOutput.writeInt(this.f40768pmvmpeiblj.lmojexxdyd());
        }
        if (i15 == 3) {
            dataOutput.writeInt(this.f40771zynmafqrjb.lmojexxdyd());
        }
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("TransitionRule[");
        sb3.append(this.f40768pmvmpeiblj.compareTo(this.f40771zynmafqrjb) > 0 ? "Gap " : "Overlap ");
        sb3.append(this.f40768pmvmpeiblj);
        sb3.append(" to ");
        sb3.append(this.f40771zynmafqrjb);
        sb3.append(", ");
        cm.zoijcleaow zoijcleaowVar = this.f40766jyumaefscl;
        if (zoijcleaowVar != null) {
            byte b13 = this.f40769yggfygwlhe;
            if (b13 == -1) {
                sb3.append(zoijcleaowVar.name());
                sb3.append(" on or before last day of ");
                sb3.append(this.f40770zdlpuopuiu.name());
            } else if (b13 < 0) {
                sb3.append(zoijcleaowVar.name());
                sb3.append(" on or before last day minus ");
                sb3.append((-this.f40769yggfygwlhe) - 1);
                sb3.append(" of ");
                sb3.append(this.f40770zdlpuopuiu.name());
            } else {
                sb3.append(zoijcleaowVar.name());
                sb3.append(" on or after ");
                sb3.append(this.f40770zdlpuopuiu.name());
                sb3.append(' ');
                sb3.append((int) this.f40769yggfygwlhe);
            }
        } else {
            sb3.append(this.f40770zdlpuopuiu.name());
            sb3.append(' ');
            sb3.append((int) this.f40769yggfygwlhe);
        }
        sb3.append(" at ");
        if (this.f40763cqumvgiudr == 0) {
            sb3.append(this.f40765iwizpuwonk);
        } else {
            long jWypolnanlu = (this.f40765iwizpuwonk.wypolnanlu() / 60) + (this.f40763cqumvgiudr * 1440);
            iobyxmoadg(sb3, fm.ppxfxbqfkf.eablkybsjg(jWypolnanlu, 60L));
            sb3.append(':');
            iobyxmoadg(sb3, fm.ppxfxbqfkf.lqeggnwhkg(jWypolnanlu, 60));
        }
        sb3.append(" ");
        sb3.append(this.f40764esjtqupxsv);
        sb3.append(", standard offset ");
        sb3.append(this.f40767lereixgezr);
        sb3.append(']');
        return sb3.toString();
    }

    public wkgbmnqykc wkgbmnqykc(int i13) {
        cm.eablkybsjg eablkybsjgVarStevsuqkhv;
        byte b13 = this.f40769yggfygwlhe;
        if (b13 < 0) {
            cm.nufgyqmvbu nufgyqmvbuVar = this.f40770zdlpuopuiu;
            eablkybsjgVarStevsuqkhv = cm.eablkybsjg.stevsuqkhv(i13, nufgyqmvbuVar, nufgyqmvbuVar.jyumaefscl(dm.gxszxtbevo.f29133cqumvgiudr.draadjrbmk(i13)) + 1 + this.f40769yggfygwlhe);
            cm.zoijcleaow zoijcleaowVar = this.f40766jyumaefscl;
            if (zoijcleaowVar != null) {
                eablkybsjgVarStevsuqkhv = eablkybsjgVarStevsuqkhv.draadjrbmk(gm.lqeggnwhkg.zoijcleaow(zoijcleaowVar));
            }
        } else {
            eablkybsjgVarStevsuqkhv = cm.eablkybsjg.stevsuqkhv(i13, this.f40770zdlpuopuiu, b13);
            cm.zoijcleaow zoijcleaowVar2 = this.f40766jyumaefscl;
            if (zoijcleaowVar2 != null) {
                eablkybsjgVarStevsuqkhv = eablkybsjgVarStevsuqkhv.draadjrbmk(gm.lqeggnwhkg.iobyxmoadg(zoijcleaowVar2));
            }
        }
        return new wkgbmnqykc(this.f40764esjtqupxsv.iobyxmoadg(cm.gxszxtbevo.wypolnanlu(eablkybsjgVarStevsuqkhv.ntlheqmsrt(this.f40763cqumvgiudr), this.f40765iwizpuwonk), this.f40767lereixgezr, this.f40768pmvmpeiblj), this.f40768pmvmpeiblj, this.f40771zynmafqrjb);
    }
}

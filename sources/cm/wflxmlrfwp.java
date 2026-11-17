package cm;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes3.dex */
final class wflxmlrfwp implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Object f20159yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private byte f20160zdlpuopuiu;

    public wflxmlrfwp() {
    }

    static Object iobyxmoadg(DataInput dataInput) {
        return wkgbmnqykc(dataInput.readByte(), dataInput);
    }

    static void lqeggnwhkg(byte b13, Object obj, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(b13);
        if (b13 == 64) {
            ((dxjokdxxww) obj).pmvmpeiblj(dataOutput);
            return;
        }
        switch (b13) {
            case 1:
                ((ppxfxbqfkf) obj).agtfadlqog(dataOutput);
                return;
            case 2:
                ((wkgbmnqykc) obj).hkdspvbjdz(dataOutput);
                return;
            case 3:
                ((eablkybsjg) obj).metgxyhuhe(dataOutput);
                return;
            case 4:
                ((gxszxtbevo) obj).okpsazkaxt(dataOutput);
                return;
            case 5:
                ((lqeggnwhkg) obj).sopmlzcsov(dataOutput);
                return;
            case 6:
                ((kcexrzcfyt) obj).ribwqtqdhb(dataOutput);
                return;
            case 7:
                ((oxmwwwfdhm) obj).lmojexxdyd(dataOutput);
                return;
            case 8:
                ((vdvldrhtss) obj).dsvhmnatus(dataOutput);
                return;
            default:
                switch (b13) {
                    case 66:
                        ((gtknphoqwx) obj).lmojexxdyd(dataOutput);
                        return;
                    case 67:
                        ((agtfadlqog) obj).yadqdtsiqt(dataOutput);
                        return;
                    case 68:
                        ((ojitshcjhn) obj).hcddaimhww(dataOutput);
                        return;
                    case 69:
                        ((btonecajqb) obj).hkdspvbjdz(dataOutput);
                        return;
                    default:
                        throw new InvalidClassException("Unknown serialized type");
                }
        }
    }

    private Object readResolve() {
        return this.f20159yggfygwlhe;
    }

    private static Object wkgbmnqykc(byte b13, DataInput dataInput) throws StreamCorruptedException {
        if (b13 == 64) {
            return dxjokdxxww.lereixgezr(dataInput);
        }
        switch (b13) {
            case 1:
                return ppxfxbqfkf.draadjrbmk(dataInput);
            case 2:
                return wkgbmnqykc.pkzmftpjix(dataInput);
            case 3:
                return eablkybsjg.jlmebxxoox(dataInput);
            case 4:
                return gxszxtbevo.jlmebxxoox(dataInput);
            case 5:
                return lqeggnwhkg.cllcsxoeiz(dataInput);
            case 6:
                return kcexrzcfyt.wypolnanlu(dataInput);
            case 7:
                return oxmwwwfdhm.yadqdtsiqt(dataInput);
            case 8:
                return vdvldrhtss.jpowsppfya(dataInput);
            default:
                switch (b13) {
                    case 66:
                        return gtknphoqwx.pmvmpeiblj(dataInput);
                    case 67:
                        return agtfadlqog.zynmafqrjb(dataInput);
                    case 68:
                        return ojitshcjhn.cdpycssgdh(dataInput);
                    case 69:
                        return btonecajqb.cdpycssgdh(dataInput);
                    default:
                        throw new StreamCorruptedException("Unknown serialized type");
                }
        }
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        byte b13 = objectInput.readByte();
        this.f20160zdlpuopuiu = b13;
        this.f20159yggfygwlhe = wkgbmnqykc(b13, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        lqeggnwhkg(this.f20160zdlpuopuiu, this.f20159yggfygwlhe, objectOutput);
    }

    wflxmlrfwp(byte b13, Object obj) {
        this.f20160zdlpuopuiu = b13;
        this.f20159yggfygwlhe = obj;
    }
}

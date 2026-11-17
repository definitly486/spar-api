package cm;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.regex.Pattern;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.zone.ZoneRulesException;

/* JADX INFO: loaded from: classes3.dex */
final class oxmwwwfdhm extends rgvfuqvkyq implements Serializable {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final Pattern f20141cqumvgiudr = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");
    private static final long serialVersionUID = 8386373296231747096L;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final transient hm.gxszxtbevo f20142iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f20143jyumaefscl;

    oxmwwwfdhm(String str, hm.gxszxtbevo gxszxtbevoVar) {
        this.f20143jyumaefscl = str;
        this.f20142iwizpuwonk = gxszxtbevoVar;
    }

    private static oxmwwwfdhm cdpycssgdh(String str) {
        if (str.equals("Z") || str.startsWith("+") || str.startsWith("-")) {
            throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: " + str);
        }
        if (str.equals("UTC") || str.equals("GMT") || str.equals("UT")) {
            return new oxmwwwfdhm(str, vdvldrhtss.f20155pmvmpeiblj.zdlpuopuiu());
        }
        if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
            vdvldrhtss vdvldrhtssVarWwaezpbzkn = vdvldrhtss.wwaezpbzkn(str.substring(3));
            if (vdvldrhtssVarWwaezpbzkn.lmojexxdyd() == 0) {
                return new oxmwwwfdhm(str.substring(0, 3), vdvldrhtssVarWwaezpbzkn.zdlpuopuiu());
            }
            return new oxmwwwfdhm(str.substring(0, 3) + vdvldrhtssVarWwaezpbzkn.kcexrzcfyt(), vdvldrhtssVarWwaezpbzkn.zdlpuopuiu());
        }
        if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
            return istkbnxepw(str, false);
        }
        vdvldrhtss vdvldrhtssVarWwaezpbzkn2 = vdvldrhtss.wwaezpbzkn(str.substring(2));
        if (vdvldrhtssVarWwaezpbzkn2.lmojexxdyd() == 0) {
            return new oxmwwwfdhm("UT", vdvldrhtssVarWwaezpbzkn2.zdlpuopuiu());
        }
        return new oxmwwwfdhm("UT" + vdvldrhtssVarWwaezpbzkn2.kcexrzcfyt(), vdvldrhtssVarWwaezpbzkn2.zdlpuopuiu());
    }

    static oxmwwwfdhm istkbnxepw(String str, boolean z13) {
        hm.gxszxtbevo gxszxtbevoVarZdlpuopuiu;
        fm.ppxfxbqfkf.dxjokdxxww(str, "zoneId");
        if (str.length() < 2 || !f20141cqumvgiudr.matcher(str).matches()) {
            throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: " + str);
        }
        try {
            gxszxtbevoVarZdlpuopuiu = hm.nufgyqmvbu.zoijcleaow(str, true);
        } catch (ZoneRulesException e13) {
            if (str.equals("GMT0")) {
                gxszxtbevoVarZdlpuopuiu = vdvldrhtss.f20155pmvmpeiblj.zdlpuopuiu();
            } else {
                if (z13) {
                    throw e13;
                }
                gxszxtbevoVarZdlpuopuiu = null;
            }
        }
        return new oxmwwwfdhm(str, gxszxtbevoVarZdlpuopuiu);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new wflxmlrfwp((byte) 7, this);
    }

    static rgvfuqvkyq yadqdtsiqt(DataInput dataInput) {
        return cdpycssgdh(dataInput.readUTF());
    }

    @Override // cm.rgvfuqvkyq
    public String kcexrzcfyt() {
        return this.f20143jyumaefscl;
    }

    void lmojexxdyd(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f20143jyumaefscl);
    }

    @Override // cm.rgvfuqvkyq
    public hm.gxszxtbevo zdlpuopuiu() {
        hm.gxszxtbevo gxszxtbevoVar = this.f20142iwizpuwonk;
        return gxszxtbevoVar != null ? gxszxtbevoVar : hm.nufgyqmvbu.zoijcleaow(this.f20143jyumaefscl, false);
    }

    @Override // cm.rgvfuqvkyq
    void zynmafqrjb(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        lmojexxdyd(dataOutput);
    }
}

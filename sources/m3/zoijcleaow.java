package m3;

import android.net.Uri;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import com.google.common.collect.lereixgezr;
import java.io.EOFException;
import java.util.Map;
import t3.ylkuphrtab;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow implements androidx.media3.exoplayer.source.iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final t3.yggfygwlhe f65075iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private t3.vdvldrhtss f65076ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private t3.rgvfuqvkyq f65077zoijcleaow;

    public zoijcleaow(t3.yggfygwlhe yggfygwlheVar) {
        this.f65075iobyxmoadg = yggfygwlheVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lqeggnwhkg(t3.rgvfuqvkyq rgvfuqvkyqVar) {
        return rgvfuqvkyqVar.eablkybsjg().getClass().getSimpleName();
    }

    @Override // androidx.media3.exoplayer.source.iwizpuwonk
    public long eablkybsjg() {
        t3.vdvldrhtss vdvldrhtssVar = this.f65076ppxfxbqfkf;
        if (vdvldrhtssVar != null) {
            return vdvldrhtssVar.getPosition();
        }
        return -1L;
    }

    @Override // androidx.media3.exoplayer.source.iwizpuwonk
    public void iobyxmoadg(long j13, long j14) {
        ((t3.rgvfuqvkyq) y2.iobyxmoadg.eablkybsjg(this.f65077zoijcleaow)).iobyxmoadg(j13, j14);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    @Override // androidx.media3.exoplayer.source.iwizpuwonk
    public void ppxfxbqfkf(v2.btonecajqb btonecajqbVar, Uri uri, Map map, long j13, long j14, t3.oxmwwwfdhm oxmwwwfdhmVar) throws UnrecognizedInputFormatException {
        t3.dxjokdxxww dxjokdxxwwVar = new t3.dxjokdxxww(btonecajqbVar, j13, j14);
        this.f65076ppxfxbqfkf = dxjokdxxwwVar;
        if (this.f65077zoijcleaow != null) {
            return;
        }
        t3.rgvfuqvkyq[] rgvfuqvkyqVarArrEablkybsjg = this.f65075iobyxmoadg.eablkybsjg(uri, map);
        com.google.common.collect.zdlpuopuiu.iobyxmoadg iobyxmoadgVarZdlpuopuiu = com.google.common.collect.zdlpuopuiu.zdlpuopuiu(rgvfuqvkyqVarArrEablkybsjg.length);
        if (rgvfuqvkyqVarArrEablkybsjg.length == 1) {
            this.f65077zoijcleaow = rgvfuqvkyqVarArrEablkybsjg[0];
        } else {
            for (t3.rgvfuqvkyq rgvfuqvkyqVar : rgvfuqvkyqVarArrEablkybsjg) {
                try {
                    if (rgvfuqvkyqVar.draadjrbmk(dxjokdxxwwVar)) {
                        this.f65077zoijcleaow = rgvfuqvkyqVar;
                        y2.iobyxmoadg.lqeggnwhkg(true);
                        dxjokdxxwwVar.gxszxtbevo();
                        break;
                    } else {
                        iobyxmoadgVarZdlpuopuiu.btonecajqb(rgvfuqvkyqVar.dxjokdxxww());
                        boolean z13 = this.f65077zoijcleaow != null || dxjokdxxwwVar.getPosition() == j13;
                        y2.iobyxmoadg.lqeggnwhkg(z13);
                        dxjokdxxwwVar.gxszxtbevo();
                    }
                } catch (EOFException unused) {
                    if (this.f65077zoijcleaow != null || dxjokdxxwwVar.getPosition() == j13) {
                    }
                } catch (Throwable th2) {
                    y2.iobyxmoadg.lqeggnwhkg(this.f65077zoijcleaow != null || dxjokdxxwwVar.getPosition() == j13);
                    dxjokdxxwwVar.gxszxtbevo();
                    throw th2;
                }
                y2.iobyxmoadg.lqeggnwhkg(z13);
                dxjokdxxwwVar.gxszxtbevo();
            }
            if (this.f65077zoijcleaow == null) {
                throw new UnrecognizedInputFormatException("None of the available extractors (" + xa.gxszxtbevo.lqeggnwhkg(", ").wkgbmnqykc(lereixgezr.nufgyqmvbu(com.google.common.collect.zdlpuopuiu.cqumvgiudr(rgvfuqvkyqVarArrEablkybsjg), new xa.eablkybsjg() { // from class: m3.iobyxmoadg
                    @Override // xa.eablkybsjg
                    public final Object apply(Object obj) {
                        return zoijcleaow.lqeggnwhkg((t3.rgvfuqvkyq) obj);
                    }
                })) + ") could read the stream.", (Uri) y2.iobyxmoadg.eablkybsjg(uri), iobyxmoadgVarZdlpuopuiu.gtknphoqwx());
            }
        }
        this.f65077zoijcleaow.ppxfxbqfkf(oxmwwwfdhmVar);
    }

    @Override // androidx.media3.exoplayer.source.iwizpuwonk
    public void release() {
        t3.rgvfuqvkyq rgvfuqvkyqVar = this.f65077zoijcleaow;
        if (rgvfuqvkyqVar != null) {
            rgvfuqvkyqVar.release();
            this.f65077zoijcleaow = null;
        }
        this.f65076ppxfxbqfkf = null;
    }

    @Override // androidx.media3.exoplayer.source.iwizpuwonk
    public int wkgbmnqykc(ylkuphrtab ylkuphrtabVar) {
        return ((t3.rgvfuqvkyq) y2.iobyxmoadg.eablkybsjg(this.f65077zoijcleaow)).zoijcleaow((t3.vdvldrhtss) y2.iobyxmoadg.eablkybsjg(this.f65076ppxfxbqfkf), ylkuphrtabVar);
    }

    @Override // androidx.media3.exoplayer.source.iwizpuwonk
    public void zoijcleaow() {
        t3.rgvfuqvkyq rgvfuqvkyqVar = this.f65077zoijcleaow;
        if (rgvfuqvkyqVar == null) {
            return;
        }
        t3.rgvfuqvkyq rgvfuqvkyqVarEablkybsjg = rgvfuqvkyqVar.eablkybsjg();
        if (rgvfuqvkyqVarEablkybsjg instanceof m4.gxszxtbevo) {
            ((m4.gxszxtbevo) rgvfuqvkyqVarEablkybsjg).gtknphoqwx();
        }
    }
}

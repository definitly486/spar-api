package androidx.media3.common.audio;

import com.google.common.collect.zdlpuopuiu;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private AudioProcessor.iobyxmoadg f9656eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f9657gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zdlpuopuiu f9658iobyxmoadg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private AudioProcessor.iobyxmoadg f9660wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f9661zoijcleaow = new ArrayList();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private ByteBuffer[] f9659ppxfxbqfkf = new ByteBuffer[0];

    public iobyxmoadg(zdlpuopuiu zdlpuopuiuVar) {
        this.f9658iobyxmoadg = zdlpuopuiuVar;
        AudioProcessor.iobyxmoadg iobyxmoadgVar = AudioProcessor.iobyxmoadg.f9651eablkybsjg;
        this.f9660wkgbmnqykc = iobyxmoadgVar;
        this.f9656eablkybsjg = iobyxmoadgVar;
        this.f9657gxszxtbevo = false;
    }

    private void lqeggnwhkg(ByteBuffer byteBuffer) {
        boolean z13;
        for (boolean z14 = true; z14; z14 = z13) {
            z13 = false;
            for (int i13 = 0; i13 <= ppxfxbqfkf(); i13++) {
                if (!this.f9659ppxfxbqfkf[i13].hasRemaining()) {
                    AudioProcessor audioProcessor = (AudioProcessor) this.f9661zoijcleaow.get(i13);
                    if (!audioProcessor.wkgbmnqykc()) {
                        ByteBuffer byteBuffer2 = i13 > 0 ? this.f9659ppxfxbqfkf[i13 - 1] : byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.f9649iobyxmoadg;
                        long jRemaining = byteBuffer2.remaining();
                        audioProcessor.gxszxtbevo(byteBuffer2);
                        this.f9659ppxfxbqfkf[i13] = audioProcessor.eablkybsjg();
                        z13 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f9659ppxfxbqfkf[i13].hasRemaining();
                    } else if (!this.f9659ppxfxbqfkf[i13].hasRemaining() && i13 < ppxfxbqfkf()) {
                        ((AudioProcessor) this.f9661zoijcleaow.get(i13 + 1)).lqeggnwhkg();
                    }
                }
            }
        }
    }

    private int ppxfxbqfkf() {
        return this.f9659ppxfxbqfkf.length - 1;
    }

    public void btonecajqb() {
        for (int i13 = 0; i13 < this.f9658iobyxmoadg.size(); i13++) {
            AudioProcessor audioProcessor = (AudioProcessor) this.f9658iobyxmoadg.get(i13);
            audioProcessor.flush();
            audioProcessor.zoijcleaow();
        }
        this.f9659ppxfxbqfkf = new ByteBuffer[0];
        AudioProcessor.iobyxmoadg iobyxmoadgVar = AudioProcessor.iobyxmoadg.f9651eablkybsjg;
        this.f9660wkgbmnqykc = iobyxmoadgVar;
        this.f9656eablkybsjg = iobyxmoadgVar;
        this.f9657gxszxtbevo = false;
    }

    public void dxjokdxxww(ByteBuffer byteBuffer) {
        if (!gxszxtbevo() || this.f9657gxszxtbevo) {
            return;
        }
        lqeggnwhkg(byteBuffer);
    }

    public boolean eablkybsjg() {
        return this.f9657gxszxtbevo && ((AudioProcessor) this.f9661zoijcleaow.get(ppxfxbqfkf())).wkgbmnqykc() && !this.f9659ppxfxbqfkf[ppxfxbqfkf()].hasRemaining();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        if (this.f9658iobyxmoadg.size() != iobyxmoadgVar.f9658iobyxmoadg.size()) {
            return false;
        }
        for (int i13 = 0; i13 < this.f9658iobyxmoadg.size(); i13++) {
            if (this.f9658iobyxmoadg.get(i13) != iobyxmoadgVar.f9658iobyxmoadg.get(i13)) {
                return false;
            }
        }
        return true;
    }

    public boolean gxszxtbevo() {
        return !this.f9661zoijcleaow.isEmpty();
    }

    public int hashCode() {
        return this.f9658iobyxmoadg.hashCode();
    }

    public AudioProcessor.iobyxmoadg iobyxmoadg(AudioProcessor.iobyxmoadg iobyxmoadgVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (iobyxmoadgVar.equals(AudioProcessor.iobyxmoadg.f9651eablkybsjg)) {
            throw new AudioProcessor.UnhandledAudioFormatException(iobyxmoadgVar);
        }
        for (int i13 = 0; i13 < this.f9658iobyxmoadg.size(); i13++) {
            AudioProcessor audioProcessor = (AudioProcessor) this.f9658iobyxmoadg.get(i13);
            AudioProcessor.iobyxmoadg iobyxmoadgVarNufgyqmvbu = audioProcessor.nufgyqmvbu(iobyxmoadgVar);
            if (audioProcessor.isActive()) {
                y2.iobyxmoadg.lqeggnwhkg(!iobyxmoadgVarNufgyqmvbu.equals(AudioProcessor.iobyxmoadg.f9651eablkybsjg));
                iobyxmoadgVar = iobyxmoadgVarNufgyqmvbu;
            }
        }
        this.f9656eablkybsjg = iobyxmoadgVar;
        return iobyxmoadgVar;
    }

    public void nufgyqmvbu() {
        if (!gxszxtbevo() || this.f9657gxszxtbevo) {
            return;
        }
        this.f9657gxszxtbevo = true;
        ((AudioProcessor) this.f9661zoijcleaow.get(0)).lqeggnwhkg();
    }

    public ByteBuffer wkgbmnqykc() {
        if (!gxszxtbevo()) {
            return AudioProcessor.f9649iobyxmoadg;
        }
        ByteBuffer byteBuffer = this.f9659ppxfxbqfkf[ppxfxbqfkf()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        lqeggnwhkg(AudioProcessor.f9649iobyxmoadg);
        return this.f9659ppxfxbqfkf[ppxfxbqfkf()];
    }

    public void zoijcleaow() {
        this.f9661zoijcleaow.clear();
        this.f9660wkgbmnqykc = this.f9656eablkybsjg;
        this.f9657gxszxtbevo = false;
        for (int i13 = 0; i13 < this.f9658iobyxmoadg.size(); i13++) {
            AudioProcessor audioProcessor = (AudioProcessor) this.f9658iobyxmoadg.get(i13);
            audioProcessor.flush();
            if (audioProcessor.isActive()) {
                this.f9661zoijcleaow.add(audioProcessor);
            }
        }
        this.f9659ppxfxbqfkf = new ByteBuffer[this.f9661zoijcleaow.size()];
        for (int i14 = 0; i14 <= ppxfxbqfkf(); i14++) {
            this.f9659ppxfxbqfkf[i14] = ((AudioProcessor) this.f9661zoijcleaow.get(i14)).eablkybsjg();
        }
    }
}

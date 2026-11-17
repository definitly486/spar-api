package k0;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class pkzmftpjix {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private BoringLayout.Metrics f53339gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CharSequence f53340iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f53341lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private CharSequence f53342nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f53343ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final TextPaint f53345zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private float f53344wkgbmnqykc = Float.NaN;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private float f53338eablkybsjg = Float.NaN;

    public pkzmftpjix(CharSequence charSequence, TextPaint textPaint, int i13) {
        this.f53340iobyxmoadg = charSequence;
        this.f53345zoijcleaow = textPaint;
        this.f53343ppxfxbqfkf = i13;
    }

    private final CharSequence gxszxtbevo() {
        CharSequence charSequence = this.f53342nufgyqmvbu;
        if (charSequence != null) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(charSequence);
            return charSequence;
        }
        if (!hcddaimhww.f53305iobyxmoadg) {
            return this.f53340iobyxmoadg;
        }
        CharSequence charSequenceEablkybsjg = hcddaimhww.eablkybsjg(this.f53340iobyxmoadg);
        this.f53342nufgyqmvbu = charSequenceEablkybsjg;
        return charSequenceEablkybsjg;
    }

    private final float lqeggnwhkg(int i13, int i14) {
        return Layout.getDesiredWidth(gxszxtbevo(), i13, i14, this.f53345zoijcleaow);
    }

    static /* synthetic */ float nufgyqmvbu(pkzmftpjix pkzmftpjixVar, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = 0;
        }
        if ((i15 & 2) != 0) {
            i14 = pkzmftpjixVar.gxszxtbevo().length();
        }
        return pkzmftpjixVar.lqeggnwhkg(i13, i14);
    }

    private final float ppxfxbqfkf() {
        BreakIterator lineInstance = BreakIterator.getLineInstance(this.f53345zoijcleaow.getTextLocale());
        CharSequence charSequence = this.f53340iobyxmoadg;
        int i13 = 0;
        lineInstance.setText(new cdpycssgdh(charSequence, 0, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new Comparator() { // from class: k0.ylkuphrtab
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return pkzmftpjix.wkgbmnqykc((gg.vdvldrhtss) obj, (gg.vdvldrhtss) obj2);
            }
        });
        int next = lineInstance.next();
        while (true) {
            int i14 = i13;
            i13 = next;
            if (i13 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new gg.vdvldrhtss(Integer.valueOf(i14), Integer.valueOf(i13)));
            } else {
                gg.vdvldrhtss vdvldrhtssVar = (gg.vdvldrhtss) priorityQueue.peek();
                if (vdvldrhtssVar != null && ((Number) vdvldrhtssVar.nufgyqmvbu()).intValue() - ((Number) vdvldrhtssVar.lqeggnwhkg()).intValue() < i13 - i14) {
                    priorityQueue.poll();
                    priorityQueue.add(new gg.vdvldrhtss(Integer.valueOf(i14), Integer.valueOf(i13)));
                }
            }
            next = lineInstance.next();
        }
        if (priorityQueue.isEmpty()) {
            return 0.0f;
        }
        Iterator it = priorityQueue.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        gg.vdvldrhtss vdvldrhtssVar2 = (gg.vdvldrhtss) it.next();
        float fLqeggnwhkg = lqeggnwhkg(((Number) vdvldrhtssVar2.iobyxmoadg()).intValue(), ((Number) vdvldrhtssVar2.wkgbmnqykc()).intValue());
        while (it.hasNext()) {
            gg.vdvldrhtss vdvldrhtssVar3 = (gg.vdvldrhtss) it.next();
            fLqeggnwhkg = Math.max(fLqeggnwhkg, lqeggnwhkg(((Number) vdvldrhtssVar3.iobyxmoadg()).intValue(), ((Number) vdvldrhtssVar3.wkgbmnqykc()).intValue()));
        }
        return fLqeggnwhkg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int wkgbmnqykc(gg.vdvldrhtss vdvldrhtssVar, gg.vdvldrhtss vdvldrhtssVar2) {
        return (((Number) vdvldrhtssVar.nufgyqmvbu()).intValue() - ((Number) vdvldrhtssVar.lqeggnwhkg()).intValue()) - (((Number) vdvldrhtssVar2.nufgyqmvbu()).intValue() - ((Number) vdvldrhtssVar2.lqeggnwhkg()).intValue());
    }

    private final float zoijcleaow() {
        BoringLayout.Metrics metricsEablkybsjg = eablkybsjg();
        float fCeil = metricsEablkybsjg != null ? metricsEablkybsjg.width : -1;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(nufgyqmvbu(this, 0, 0, 3, null));
        }
        return hcddaimhww.wkgbmnqykc(fCeil, this.f53340iobyxmoadg, this.f53345zoijcleaow) ? fCeil + 0.5f : fCeil;
    }

    public final float btonecajqb() {
        if (!Float.isNaN(this.f53338eablkybsjg)) {
            return this.f53338eablkybsjg;
        }
        float fPpxfxbqfkf = ppxfxbqfkf();
        this.f53338eablkybsjg = fPpxfxbqfkf;
        return fPpxfxbqfkf;
    }

    public final float dxjokdxxww() {
        if (!Float.isNaN(this.f53344wkgbmnqykc)) {
            return this.f53344wkgbmnqykc;
        }
        float fZoijcleaow = zoijcleaow();
        this.f53344wkgbmnqykc = fZoijcleaow;
        return fZoijcleaow;
    }

    public final BoringLayout.Metrics eablkybsjg() {
        if (!this.f53341lqeggnwhkg) {
            this.f53339gxszxtbevo = gtknphoqwx.f53303iobyxmoadg.ppxfxbqfkf(this.f53340iobyxmoadg, this.f53345zoijcleaow, uwvvkdfqfp.gtknphoqwx(this.f53343ppxfxbqfkf));
            this.f53341lqeggnwhkg = true;
        }
        return this.f53339gxszxtbevo;
    }
}

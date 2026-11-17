package l0;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg extends zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CharSequence f61211iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final BreakIterator f61212zoijcleaow;

    public eablkybsjg(CharSequence charSequence) {
        this.f61211iobyxmoadg = charSequence;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f61212zoijcleaow = characterInstance;
    }

    @Override // l0.zoijcleaow
    public int eablkybsjg(int i13) {
        return this.f61212zoijcleaow.following(i13);
    }

    @Override // l0.zoijcleaow
    public int gxszxtbevo(int i13) {
        return this.f61212zoijcleaow.preceding(i13);
    }
}

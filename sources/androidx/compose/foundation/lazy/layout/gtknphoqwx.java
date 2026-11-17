package androidx.compose.foundation.lazy.layout;

/* JADX INFO: loaded from: classes.dex */
public abstract class gtknphoqwx {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Void ppxfxbqfkf() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
    }

    public static final androidx.compose.ui.wkgbmnqykc zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, agtfadlqog agtfadlqogVar, btonecajqb btonecajqbVar, boolean z13, jztzpxfvev.jlmebxxoox jlmebxxooxVar) {
        return wkgbmnqykcVar.eablkybsjg(new LazyLayoutBeyondBoundsModifierElement(agtfadlqogVar, btonecajqbVar, z13, jlmebxxooxVar));
    }
}

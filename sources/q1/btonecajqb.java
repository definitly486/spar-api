package q1;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class btonecajqb implements dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LocaleList f77633iobyxmoadg;

    btonecajqb(Object obj) {
        this.f77633iobyxmoadg = (LocaleList) obj;
    }

    public boolean equals(Object obj) {
        return this.f77633iobyxmoadg.equals(((dxjokdxxww) obj).zoijcleaow());
    }

    @Override // q1.dxjokdxxww
    public Locale get(int i13) {
        return this.f77633iobyxmoadg.get(i13);
    }

    public int hashCode() {
        return this.f77633iobyxmoadg.hashCode();
    }

    @Override // q1.dxjokdxxww
    public String iobyxmoadg() {
        return this.f77633iobyxmoadg.toLanguageTags();
    }

    @Override // q1.dxjokdxxww
    public boolean isEmpty() {
        return this.f77633iobyxmoadg.isEmpty();
    }

    @Override // q1.dxjokdxxww
    public int size() {
        return this.f77633iobyxmoadg.size();
    }

    public String toString() {
        return this.f77633iobyxmoadg.toString();
    }

    @Override // q1.dxjokdxxww
    public Object zoijcleaow() {
        return this.f77633iobyxmoadg;
    }
}

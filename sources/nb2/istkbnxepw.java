package nb2;

import android.content.SharedPreferences;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public final class istkbnxepw {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final Object f69569ppxfxbqfkf = new Object();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final cqumvgiudr f69570iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final yadqdtsiqt f69571zoijcleaow;

    public istkbnxepw(cqumvgiudr sharedPreferenceProvider, yadqdtsiqt uuidFactory) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sharedPreferenceProvider, "sharedPreferenceProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uuidFactory, "uuidFactory");
        this.f69570iobyxmoadg = sharedPreferenceProvider;
        this.f69571zoijcleaow = uuidFactory;
    }

    public final String iobyxmoadg() {
        this.f69571zoijcleaow.getClass();
        String value = UUID.randomUUID().toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(value, "randomUUID().toString()");
        SharedPreferences sharedPreferences = this.f69570iobyxmoadg.f69551iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sharedPreferences, "sharedPreferences");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("USER_ID_KEY", value);
        editorEdit.apply();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        return value;
    }
}

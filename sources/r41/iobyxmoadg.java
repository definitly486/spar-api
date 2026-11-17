package r41;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;
import kotlin.jvm.internal.zdlpuopuiu;
import uw0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f81705iobyxmoadg = new iobyxmoadg();

    private iobyxmoadg() {
    }

    public final void iobyxmoadg(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        Locale locale = new Locale(ppxfxbqfkf.f114521iobyxmoadg.lereixgezr());
        Locale.setDefault(locale);
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        context.createConfigurationContext(configuration);
    }
}

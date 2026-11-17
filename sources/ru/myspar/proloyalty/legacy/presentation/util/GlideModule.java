package ru.myspar.proloyalty.legacy.presentation.util;

import android.content.Context;
import com.bumptech.glide.Registry;
import com.bumptech.glide.zoijcleaow;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import p21.gxszxtbevo;
import r8.nufgyqmvbu;
import rf.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/myspar/proloyalty/legacy/presentation/util/GlideModule;", "La9/iobyxmoadg;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/bumptech/glide/zoijcleaow;", "glide", "Lcom/bumptech/glide/Registry;", "registry", "Lgg/wwaezpbzkn;", "iobyxmoadg", "(Landroid/content/Context;Lcom/bumptech/glide/zoijcleaow;Lcom/bumptech/glide/Registry;)V", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GlideModule extends a9.iobyxmoadg {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lru/myspar/proloyalty/legacy/presentation/util/GlideModule$iobyxmoadg;", "", "Lp21/gxszxtbevo;", "ppxfxbqfkf", "()Lp21/gxszxtbevo;", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface iobyxmoadg {
        gxszxtbevo ppxfxbqfkf();
    }

    @Override // a9.ppxfxbqfkf
    public void iobyxmoadg(Context context, zoijcleaow glide, Registry registry) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(glide, "glide");
        zdlpuopuiu.btonecajqb(registry, "registry");
        Context applicationContext = context.getApplicationContext();
        zdlpuopuiu.lqeggnwhkg(applicationContext);
        registry.kcexrzcfyt(nufgyqmvbu.class, InputStream.class, new com.bumptech.glide.integration.okhttp3.iobyxmoadg.C0381iobyxmoadg(((iobyxmoadg) ppxfxbqfkf.iobyxmoadg(applicationContext, iobyxmoadg.class)).ppxfxbqfkf().iobyxmoadg()));
    }
}

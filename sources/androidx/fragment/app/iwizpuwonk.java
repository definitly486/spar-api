package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class iwizpuwonk extends zdlpuopuiu {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final FragmentManager f9238cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final int f9239iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Handler f9240jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Context f9241yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Activity f9242zdlpuopuiu;

    public iwizpuwonk(Activity activity, Context context, Handler handler, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(handler, "handler");
        this.f9242zdlpuopuiu = activity;
        this.f9241yggfygwlhe = context;
        this.f9240jyumaefscl = handler;
        this.f9239iwizpuwonk = i13;
        this.f9238cqumvgiudr = new iozdgvuglv();
    }

    public void agtfadlqog(Fragment fragment, Intent intent, int i13, Bundle bundle) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fragment, "fragment");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (i13 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        androidx.core.content.iobyxmoadg.startActivity(this.f9241yggfygwlhe, intent, bundle);
    }

    public abstract Object btonecajqb();

    public void draadjrbmk(Fragment fragment, String[] permissions, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fragment, "fragment");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(permissions, "permissions");
    }

    public abstract void dxjokdxxww(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public final Activity eablkybsjg() {
        return this.f9242zdlpuopuiu;
    }

    public abstract LayoutInflater gtknphoqwx();

    public final Context gxszxtbevo() {
        return this.f9241yggfygwlhe;
    }

    public final FragmentManager lqeggnwhkg() {
        return this.f9238cqumvgiudr;
    }

    public final Handler nufgyqmvbu() {
        return this.f9240jyumaefscl;
    }

    public void ojitshcjhn(Fragment fragment, IntentSender intent, int i13, Intent intent2, int i14, int i15, int i16, Bundle bundle) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fragment, "fragment");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (i13 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        Activity activity = this.f9242zdlpuopuiu;
        if (activity == null) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        androidx.core.app.zoijcleaow.draadjrbmk(activity, intent, i13, intent2, i14, i15, i16, bundle);
    }

    public abstract void rgvfuqvkyq();

    public abstract boolean wflxmlrfwp(String str);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public iwizpuwonk(oxmwwwfdhm activity) {
        this(activity, activity, new Handler(), 0);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
    }
}

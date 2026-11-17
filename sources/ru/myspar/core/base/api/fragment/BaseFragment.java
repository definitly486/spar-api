package ru.myspar.core.base.api.fragment;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import q30.iobyxmoadg;
import rs.wkgbmnqykc;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u0006J\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001eH\u0004¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u00122\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\"H\u0004¢\u0006\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/myspar/core/base/api/fragment/BaseFragment;", "Landroidx/fragment/app/Fragment;", "", "layoutId", "<init>", "(I)V", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lgg/wwaezpbzkn;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onResume", "", "isHidden", "onHiddenChanged", "(Z)V", "onPause", "onStop", "onDestroyView", "onDestroy", "", "error", "lmojexxdyd", "(Ljava/lang/Throwable;)V", "", "permission", "cdpycssgdh", "(Ljava/lang/String;)Z", "", "permissions", "yadqdtsiqt", "([Ljava/lang/String;)Z", "iozdgvuglv", "()Ljava/lang/String;", ExternalMetricsManagerImpl.NAME, "base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseFragment extends Fragment {
    public BaseFragment(int i13) {
        super(i13);
    }

    private final String iozdgvuglv() {
        return getClass().getSimpleName() + "[" + hashCode() + "]";
    }

    protected final boolean cdpycssgdh(String permission) {
        zdlpuopuiu.btonecajqb(permission, "permission");
        return yadqdtsiqt(new String[]{permission});
    }

    protected final void lmojexxdyd(Throwable error) {
        zdlpuopuiu.btonecajqb(error, "error");
        iobyxmoadg.f77790iobyxmoadg.zoijcleaow(error);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        wkgbmnqykc.wkgbmnqykc(wkgbmnqykc.f83693iobyxmoadg, "LIFECYCLE_TAG", iozdgvuglv() + " onCreate", false, 4, null);
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        wkgbmnqykc.wkgbmnqykc(wkgbmnqykc.f83693iobyxmoadg, "LIFECYCLE_TAG", iozdgvuglv() + " onDestroy", false, 4, null);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        wkgbmnqykc.wkgbmnqykc(wkgbmnqykc.f83693iobyxmoadg, "LIFECYCLE_TAG", iozdgvuglv() + " onDestroyView", false, 4, null);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean isHidden) {
        wkgbmnqykc.wkgbmnqykc(wkgbmnqykc.f83693iobyxmoadg, "LIFECYCLE_TAG", iozdgvuglv() + " onHiddenChanged; isHidden - " + isHidden, false, 4, null);
        super.onHiddenChanged(isHidden);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        wkgbmnqykc.wkgbmnqykc(wkgbmnqykc.f83693iobyxmoadg, "LIFECYCLE_TAG", iozdgvuglv() + " onPause", false, 4, null);
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        wkgbmnqykc.wkgbmnqykc(wkgbmnqykc.f83693iobyxmoadg, "LIFECYCLE_TAG", iozdgvuglv() + " onResume", false, 4, null);
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        wkgbmnqykc.wkgbmnqykc(wkgbmnqykc.f83693iobyxmoadg, "LIFECYCLE_TAG", iozdgvuglv() + " onStart", false, 4, null);
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        wkgbmnqykc.wkgbmnqykc(wkgbmnqykc.f83693iobyxmoadg, "LIFECYCLE_TAG", iozdgvuglv() + " onStop", false, 4, null);
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(view, "view");
        wkgbmnqykc.wkgbmnqykc(wkgbmnqykc.f83693iobyxmoadg, "LIFECYCLE_TAG", iozdgvuglv() + " onViewCreated", false, 4, null);
        super.onViewCreated(view, savedInstanceState);
    }

    protected final boolean yadqdtsiqt(String[] permissions) {
        zdlpuopuiu.btonecajqb(permissions, "permissions");
        for (String str : permissions) {
            if (androidx.core.content.iobyxmoadg.checkSelfPermission(requireContext(), str) != 0) {
                return false;
            }
        }
        return true;
    }

    public BaseFragment() {
    }
}

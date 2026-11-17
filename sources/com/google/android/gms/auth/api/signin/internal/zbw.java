package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import androidx.loader.app.iobyxmoadg;
import androidx.loader.content.zoijcleaow;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes2.dex */
final class zbw implements iobyxmoadg.InterfaceC0153iobyxmoadg {
    final /* synthetic */ SignInHubActivity zba;

    /* synthetic */ zbw(SignInHubActivity signInHubActivity, zbv zbvVar) {
        this.zba = signInHubActivity;
    }

    @Override // androidx.loader.app.iobyxmoadg.InterfaceC0153iobyxmoadg
    public final zoijcleaow onCreateLoader(int i13, Bundle bundle) {
        return new zbc(this.zba, GoogleApiClient.getAllClients());
    }

    @Override // androidx.loader.app.iobyxmoadg.InterfaceC0153iobyxmoadg
    public final /* bridge */ /* synthetic */ void onLoadFinished(zoijcleaow zoijcleaowVar, Object obj) {
        SignInHubActivity signInHubActivity = this.zba;
        signInHubActivity.setResult(signInHubActivity.zbe, signInHubActivity.zbf);
        this.zba.finish();
    }

    @Override // androidx.loader.app.iobyxmoadg.InterfaceC0153iobyxmoadg
    public final void onLoaderReset(zoijcleaow zoijcleaowVar) {
    }
}

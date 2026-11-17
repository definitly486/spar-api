package kk;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: loaded from: classes3.dex */
public final class n00 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final /* synthetic */ npi.spay.rj f57703iobyxmoadg;

    public n00(npi.spay.rj rjVar) {
        this.f57703iobyxmoadg = rjVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(network, "network");
        super.onLost(network);
        ((wa0) this.f57703iobyxmoadg.yadqdtsiqt()).draadjrbmk(rv.f58473iobyxmoadg);
    }
}

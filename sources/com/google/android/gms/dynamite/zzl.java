package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzl implements DynamiteModule.VersionPolicy {
    zzl() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        int iZzb;
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int iZza = iVersions.zza(context, str);
        selectionResult.localVersion = iZza;
        int i13 = 1;
        int i14 = 0;
        if (iZza != 0) {
            iZzb = iVersions.zzb(context, str, false);
            selectionResult.remoteVersion = iZzb;
        } else {
            iZzb = iVersions.zzb(context, str, true);
            selectionResult.remoteVersion = iZzb;
        }
        int i15 = selectionResult.localVersion;
        if (i15 == 0) {
            if (iZzb == 0) {
                i13 = 0;
            }
            selectionResult.selection = i13;
            return selectionResult;
        }
        i14 = i15;
        if (iZzb < i14) {
            i13 = -1;
        }
        selectionResult.selection = i13;
        return selectionResult;
    }
}

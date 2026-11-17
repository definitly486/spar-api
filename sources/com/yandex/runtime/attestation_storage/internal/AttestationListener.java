package com.yandex.runtime.attestation_storage.internal;

/* JADX INFO: loaded from: classes3.dex */
public interface AttestationListener {
    void onAttestationFailed(String str);

    void onAttestationReceived(byte[] bArr);
}

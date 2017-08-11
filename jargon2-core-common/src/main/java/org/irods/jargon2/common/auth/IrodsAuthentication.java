/**
 * 
 */
package org.irods.jargon2.common.auth;

/**
 * Represents the outcome of authenticating an {@link IrodsPrincipal},
 * containing information about that authentication. This includes the original
 * principal as well as any transformed or intermediary principal used to
 * connect to iRODS.
 * 
 * @author mcc
 *
 */
public class IrodsAuthentication {

	/**
	 * The original {@link IrodsPrincipal} presented to iRODS during
	 * authentication
	 */
	private IrodsPrincipal originalPrincipal;
	/**
	 * The actual {@link IrodsPrincipal} used by iRODS. This could be the same
	 * as the original, or it could be a generated one. For example, in PAM
	 * authentication, a temporary iRODS user/password is used after the
	 * authentication is successful with the original PAM credentials. In that
	 * case, the original is the PAM credential, and the effective is the
	 * temporary password.
	 * <p/>
	 * STANDARD authentication is a case where the original and effective would
	 * be the same
	 *
	 */
	private IrodsPrincipal effectivePrincipal;

	/**
	 * 
	 */
	public IrodsAuthentication() {
	}

	public IrodsPrincipal getOriginalPrincipal() {
		return originalPrincipal;
	}

	public void setOriginalPrincipal(IrodsPrincipal originalPrincipal) {
		this.originalPrincipal = originalPrincipal;
	}

	public IrodsPrincipal getEffectivePrincipal() {
		return effectivePrincipal;
	}

	public void setEffectivePrincipal(IrodsPrincipal effectivePrincipal) {
		this.effectivePrincipal = effectivePrincipal;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IrodsAuthentication [");
		if (originalPrincipal != null) {
			builder.append("originalPrincipal=").append(originalPrincipal).append(", ");
		}
		if (effectivePrincipal != null) {
			builder.append("effectivePrincipal=").append(effectivePrincipal);
		}
		builder.append("]");
		return builder.toString();
	}

}

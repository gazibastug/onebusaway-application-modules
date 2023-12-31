/**
 * Copyright (C) 2021 Cambridge Systematics, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onebusaway.users.impl.authentication;

import org.springframework.security.crypto.password.MessageDigestPasswordEncoder;

/**
 * Retain compatibility with the previous salted password setup.
 */
public class SaltedSha256PasswordEncoder extends MessageDigestPasswordEncoder {


  public SaltedSha256PasswordEncoder(String algorithm) {
    super(algorithm);
  }

  public String encodePassword(String password, String salt) {
    //MessageDigest will extract the salt if its of this format below
    return encode("{" + salt + "}" + password);
  }

}


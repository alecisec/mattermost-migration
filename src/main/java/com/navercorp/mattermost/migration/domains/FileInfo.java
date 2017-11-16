/*
 *	Copyright 2016 Naver Corp.
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *  THIS CODE HAS BEEN MODIFIED - This file was created as part of the 4.3.2 fork for Naver's original code
 *
 */
package com.navercorp.mattermost.migration.domains;

import java.math.BigInteger;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileInfo {
  private String Id;
  private String CreatorId;
  private String PostId;
  private BigInteger CreateAt;
  private BigInteger UpdateAt;
  private BigInteger DeleteAt;
  private String Path;
  private String ThumbnailPath;
  private String PreviewPath;
  private String Name;
  private String Extension;
  private BigInteger Size;
  private String MimeType;
  private long Width;
  private long Height;
  private boolean HasPreviewImage;
  
}

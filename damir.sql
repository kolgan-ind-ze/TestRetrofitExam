USE [Dam1r]
GO
/****** Object:  Table [dbo].[Children]    Script Date: 28.06.2023 3:17:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Children](
	[id_child] [int] IDENTITY(1,1) NOT NULL,
	[full_name] [nvarchar](200) NOT NULL,
	[num_tel_parents] [nvarchar](11) NOT NULL,
	[id_group] [int] NOT NULL,
	[age] [int] NOT NULL,
 CONSTRAINT [PK_Table_1] PRIMARY KEY CLUSTERED 
(
	[id_child] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Groups]    Script Date: 28.06.2023 3:17:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Groups](
	[id_group] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[count_child] [int] NOT NULL,
	[id_type] [int] NOT NULL,
 CONSTRAINT [PK_Groups] PRIMARY KEY CLUSTERED 
(
	[id_group] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Type_groups]    Script Date: 28.06.2023 3:17:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Type_groups](
	[id_type] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[max_count] [int] NOT NULL,
 CONSTRAINT [PK_Child_groups] PRIMARY KEY CLUSTERED 
(
	[id_type] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Users]    Script Date: 28.06.2023 3:17:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Users](
	[id_user] [int] IDENTITY(1,1) NOT NULL,
	[login] [nvarchar](50) NOT NULL,
	[password] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Users] PRIMARY KEY CLUSTERED 
(
	[id_user] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Children] ON 

INSERT [dbo].[Children] ([id_child], [full_name], [num_tel_parents], [id_group], [age]) VALUES (1, N'Иванов Иван Иванович', N'89099878912', 1, 5)
INSERT [dbo].[Children] ([id_child], [full_name], [num_tel_parents], [id_group], [age]) VALUES (2, N'Петрова Мария Ивановна', N'89087658912', 2, 6)
SET IDENTITY_INSERT [dbo].[Children] OFF
GO
SET IDENTITY_INSERT [dbo].[Groups] ON 

INSERT [dbo].[Groups] ([id_group], [name], [count_child], [id_type]) VALUES (2, N'Зайчики', 20, 1)
INSERT [dbo].[Groups] ([id_group], [name], [count_child], [id_type]) VALUES (3, N'Непоседы', 20, 2)
SET IDENTITY_INSERT [dbo].[Groups] OFF
GO
SET IDENTITY_INSERT [dbo].[Type_groups] ON 

INSERT [dbo].[Type_groups] ([id_type], [name], [max_count]) VALUES (1, N'Младшая', 20)
INSERT [dbo].[Type_groups] ([id_type], [name], [max_count]) VALUES (2, N'Старшая', 20)
SET IDENTITY_INSERT [dbo].[Type_groups] OFF
GO
ALTER TABLE [dbo].[Groups]  WITH CHECK ADD  CONSTRAINT [FK_Groups_Type_groups] FOREIGN KEY([id_type])
REFERENCES [dbo].[Type_groups] ([id_type])
GO
ALTER TABLE [dbo].[Groups] CHECK CONSTRAINT [FK_Groups_Type_groups]
GO

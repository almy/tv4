package com.myftiu.tv4.model;

/**
 * @author by ali myftiu on 27/11/14.
 */
public class PartecipantDettail {

	private int id;
	private String title;
	private String description;
	private String image;

	public PartecipantDettail(int id)
	{
		this.id = id;
	}


	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getImage()
	{
		return image;
	}

	public void setImage(String image)
	{
		this.image = image;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}

		PartecipantDettail that = (PartecipantDettail) o;

		if (id != that.id)
		{
			return false;
		}
		if (description != null ? !description.equals(that.description) : that.description != null)
		{
			return false;
		}
		if (image != null ? !image.equals(that.image) : that.image != null)
		{
			return false;
		}
		if (title != null ? !title.equals(that.title) : that.title != null)
		{
			return false;
		}

		return true;
	}

	@Override
	public int hashCode()
	{
		int result = id;
		result = 31 * result + (title != null ? title.hashCode() : 0);
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + (image != null ? image.hashCode() : 0);
		return result;
	}

	@Override
	public String toString()
	{
		return "PartecipantDettail{" +
				"id=" + id +
				", title='" + title + '\'' +
				", description='" + description + '\'' +
				", image='" + image + '\'' +
				'}';
	}
}
